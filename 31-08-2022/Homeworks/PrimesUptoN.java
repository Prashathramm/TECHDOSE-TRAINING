import java.util.*;
public class PrimesUptoN {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        solve(n);
    }
    public static void solve(int n) {
        boolean[] f=new boolean[n+1];
        for(int i=2;i*i<=n;++i) {
            if(!f[i]) {
                for(int j=i*2;j<=n;j+=i) {
                    f[j]=true;
                }
            }
        }
        for(int i=1;i<=n;++i) {
            if(f[i]==false) {
                System.out.print(i+" ");
            }
        }
    }
}
