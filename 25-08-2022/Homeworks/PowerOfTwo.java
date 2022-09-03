import java.util.*;
public class PowerOfTwo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        solve(n);
    }
    public static void solve(int n) {
        System.out.print((n>0 && (n&(n-1))==0)?"True":"False");
    }
}