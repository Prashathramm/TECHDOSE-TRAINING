import java.util.*;
public class PrimeFactors {
    static Set<Integer>set=new HashSet<>();
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        solve(n);
        System.out.print(set);
    }
    public static void solve(int n) {
        for(int i=2;i<=n;++i) {
            while(n%i==0) {
                set.add(i);
                n/=i;
            }
        }
    }
}
