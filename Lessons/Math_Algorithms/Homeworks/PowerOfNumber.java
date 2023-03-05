import java.util.*;
public class PowerOfNumber {
    static long mod=(long)(1e9+7);
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),b=sc.nextInt();
        solve(n,b);
    }
    public static void solve(int n,int exp) {
        System.out.print(get((long)n,(long)exp));
    }
    public static long get(long n,long exp) {
        if(exp==1) return n;
        if(exp%2==0) {
            long res=get(n,exp/2);
            return (res*res)mod;
        } else {
            long res=get(n,(exp-1)/2);
            return (n*res*res)%mod;
        }
    }
}
