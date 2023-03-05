package Lessons.Backtracking.Assignments;

public class WordSearch {
    int[][] dir=new int[][]{{-1,0},{0,-1},{0,1},{1,0}};
    boolean[][] vis;
    public boolean exist(char[][] board, String word) {
        vis=new boolean[board.length][board[0].length];
        int k=0;
        for(int j=0;j<board.length;++j) {
            for(int i=0;i<board[0].length;++i) {
                if(board[j][i]==word.charAt(k)) {
                    vis[j][i]=true;
                    if(found(board,word,k+1,j,i,word.charAt(k)+""))
                        return true;
                    vis[j][i]=false;
                }
            }
        }
        return false;
    }
    public boolean found(char[][] b,String w,int idx,int r,int c,String curr) {
        if(idx==w.length()) {
            System.out.println(curr);
            return curr.equals(w);
        }
        boolean got=false;
        for(int i=0;i<4;++i) {
            int x=r+dir[i][0];
            int y=c+dir[i][1];
            if(x>-1 && x<b.length && y>-1 && y<b[0].length) {
                if(!vis[x][y] && w.charAt(idx)==b[x][y]) {
                    vis[x][y]=true;
                    got=found(b,w,idx+1,x,y,curr+b[x][y]);
                    if(got) 
                        break;
                    else 
                        vis[x][y]=false;
                }
            }
        }
        return got;
    }
}
