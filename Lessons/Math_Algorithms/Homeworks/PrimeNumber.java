import java.util.*;
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        solve(n);
    }
    public static void solve(int n) {
        if(n==1) {
            System.out.print("1 is neither Prime nor Composite");
        } else {
            for(int i=2;i*i<=n;++i) {
                if(n%i==0) {
                    System.out.print("It is not a Prime Number");
                    return;
                }
            }
            System.out.print("It is a Prime Number");
        }
    }
}
