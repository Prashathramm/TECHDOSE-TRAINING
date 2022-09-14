import java.util.*;
public class CountSetBits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        solve(n);
    }
    public static void solve(int n) {
        int cnt=0;
        while(n>0) {
            cnt+=(n&1);
            n>>=1;
        }
        System.out.print(cnt);
    }

}
