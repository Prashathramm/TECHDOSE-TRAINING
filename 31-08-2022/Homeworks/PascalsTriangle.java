import java.util.*;
public class PascalsTriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        solve(n);
    }
    public static void solve(int n) {
        int[][] m=new int[n][n];
        for(int i=0;i<n;++i) {
            for(int j=0;j<=i;++j) {
                if(j==0 || j==i) m[i][j]=1;
                else m[i][j]=m[i-1][j-1]+m[i-1][j];
                System.out.print(m[i][j]+" ");
            }
            System.out.println();
        }
    }
}
