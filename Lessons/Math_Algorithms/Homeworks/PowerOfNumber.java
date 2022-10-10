import java.util.*;
public class PowerOfNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),b=sc.nextInt();
        solve(n,b);
    }
    public static void solve(int n,int exp) {
        System.out.print(get(n,exp));
    }
    public static int get(int n,int exp) {
        if(exp==1) return n;
        if(exp%2==0) {
            int res=get(n,exp/2);
            return res*res;
        } else {
            int res=get(n,(exp-1)/2);
            return n*res*res;
        }
    }
}
