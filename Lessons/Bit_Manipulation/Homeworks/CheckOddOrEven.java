import java.util.*;
public class CheckOddOrEven {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        solve(n);
    }
    public static void solve(int n) {
        System.out.print(((n&1)==1)?"Odd":"Even");
    }
     
}
