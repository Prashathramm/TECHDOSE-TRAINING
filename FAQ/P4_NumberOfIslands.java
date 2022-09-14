class Solution {
    int[][] dir=new int[][]{{-1,0},{0,-1},{0,1},{1,0}};
    public int numIslands(char[][] grid) {
        int res=0;
        int r=grid.length,c=grid[0].length;
        for(int i=0;i<r;++i) {
            for(int j=0;j<c;++j) {
                if(grid[i][j]=='1') {
                    grid[i][j]='0';
                    res++;
                    dfs(i,j,r,c,grid);
                }
            }
        }
        return res;
    }
    public void dfs(int r,int c,int row,int col,char[][] isl) {
        for(int i=0;i<4;++i) {
            int x=dir[i][0]+r,y=dir[i][1]+c;
            if(x>-1 && x<row && y>-1 && y<col) {
                if(isl[x][y]=='1') {
                    isl[x][y]='0';
                    dfs(x,y,row,col,isl);
                }
            }
        }
    }
}