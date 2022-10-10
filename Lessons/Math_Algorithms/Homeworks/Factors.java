import java.util.*;
public class Factors {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        solve(n);
    }
    public static void solve(int n) {
        for(int i=1;i*i<=n;++i) {
            if(n%i==0) {
                if(n/i==i) {
                    System.out.print(i+" ");
                } else {
                    System.out.print(n/i+" "+i+" ");
                }
            }
        }
    }
}