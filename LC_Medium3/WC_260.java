package LC_Medium3;
import java.util.*;
public class WC_260 {
    public boolean placeWordInCrossword(char[][] board, String word) {
        int r=board.length,c=board[0].length;
        List<int[]>validRows=new ArrayList<>(),validCols=new ArrayList<>();
        for(int i=0;i<r;++i) {
            for(int j=0;j<c;++j) {
                if(board[i][j]!='#') {
                    int l=0,t=j;
                    while(t<c && board[i][t]!='#') {
                        l++;
                        t++;
                    }
                  
                    if(l==word.length()) {
                        validRows.add(new int[]{i,j});
                    }
                    j=t-1;
                }
            }
        }
        for(int i=0;i<c;++i) {
            for(int j=0;j<r;++j) {
                if(board[j][i]!='#') {
                    int l=0,t=j;
                    while(t<r && board[t][i]!='#') {
                        l++;
                        t++;
                    }
                    if(l==word.length()) {
                        validCols.add(new int[]{i,j});
                    }
                    j=t-1;
                }
            }
        }
        for(int[] i:validRows) System.out.print(Arrays.toString(i)+" "+word);
        System.out.print("\n");
        
        for(int[] i:validRows) {
            int x=i[0],y=i[1];
            int curr=0;
            for(int j=y;j<y+word.length();++j) {
                if(board[x][j]==' ' || board[x][j]==word.charAt(curr)) {
                    curr++;
                } else {
                    break;
                }
            }
            if(curr==word.length())
                return true;
            curr=0;
            for(int j=y+word.length()-1;j>=y;--j) {
                if(board[x][j]==' ' || board[x][j]==word.charAt(curr)) {
                    curr++;
                } else {
                    break;
                }
            }
            if(curr==word.length())
                return true;
        }
        
        for(int[] i:validCols) {
            int x=i[0],y=i[1];
            int curr=0;
            for(int j=y;j<word.length()+y;++j) {
                if(board[j][x]==' ' || (board[j][x]==word.charAt(curr))) {
                    curr++;
                } else {
                    break;
                }
            }
            if(curr==word.length())
                return true;
            curr=0;
            for(int j=word.length()+y-1;j>=y;--j) {
                if(board[j][x]==' ' || board[j][x]==word.charAt(curr)) {
                    curr++;
                } else {
                    break;
                }
            }
            if(curr==word.length())
                return true;
        }
        return false;
    }
    
}
