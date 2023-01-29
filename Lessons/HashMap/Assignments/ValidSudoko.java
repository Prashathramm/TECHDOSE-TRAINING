package Lessons.HashMap.Assignments;

public class ValidSudoko {
    public boolean isValidSudoku(char[][] board) {
        for(int i=0;i<9;++i) {
            int r1=0,r2=0;
            for(int j=0;j<9;++j) {
                char c1=board[i][j],c2=board[j][i];
                if(c1!='.') {
                    int v=c1-'0';
                    if((r1&(1<<v))!=0)
                        return false;
                    r1|=(1<<v);
                }
                if(c2!='.') {
                    int v=c2-'0';
                    if((r2&(1<<v))!=0)
                        return false;
                    r2|=(1<<v);
                }
            }
        }
        for(int i=0;i<9;i+=3) {
            for(int j=0;j<9;j+=3) {
                int r=0;
                for(int k=i;k<i+3;++k) {
                    for(int l=j;l<j+3;++l) {
                        if(board[k][l]!='.') {
                            int v=board[k][l]-'0';
                            if((r&(1<<v))!=0)
                                return false;
                            r|=(1<<v);
                        }
                    }
                }
            }
        }
        return true;
    }
}
