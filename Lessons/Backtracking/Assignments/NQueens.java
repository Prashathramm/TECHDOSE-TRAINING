package Lessons.Backtracking.Assignments;
import java.util.*;
public class NQueens {
    char[][] board;
    List<List<String>>ret=new ArrayList<>();
    public List<List<String>> solveNQueens(int n) {
        board=new char[n][n];
        for(char[] i:board) Arrays.fill(i,'.');
        for(int i=0;i<n;++i) {
            if(isValid(0,i,n)) {
                board[0][i]='Q';
                explore(1,0,n);
                board[0][i]='.';
            }
        }
        return ret;
    }
    public boolean isValid(int row,int col,int n) {
        for(int i=row-1;i>-1;--i) {
            if(board[i][col]=='Q')
                return false;
        }
        for(int i=row+1;i<n;++i) {
            if(board[i][col]=='Q')
                return false;
        }
        for(int i=col-1;i>-1;--i) {
            if(board[row][i]=='Q')
                return false;
        }
        for(int i=col+1;i<n;++i) {
            if(board[row][i]=='Q')
                return false;
        }
        int r=row-1,c=col-1,d=col+1;
        while(r>-1) {
            if(c>-1 && board[r][c]=='Q') 
                return false;
            if(d<n && board[r][d]=='Q')
                return false;
            r--;
            c--;
            d++;
        }
        return true;
    }
    public void explore(int row,int col,int n) {
        if(row==n) {
            List<String>res=new ArrayList<>();
            for(int i=0;i<n;++i) {
                res.add(new String(board[i]));
            }
            ret.add(res);
            return;
        }
        for(int i=col;i<n;++i) {
            if(isValid(row,i,n)) {
                board[row][i]='Q';
                explore(row+1,0,n);
                board[row][i]='.';
            }
        }
    }
}
