import java.util.*;
public class FlipithBit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),pos=sc.nextInt();
        solve(n,pos);
    }
    public static void solve(int n,int pos) {
        System.out.print(n^(1<<pos));
    }
}
