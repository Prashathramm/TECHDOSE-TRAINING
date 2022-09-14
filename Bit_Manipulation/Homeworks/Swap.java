import java.util.*;
public class Swap {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt(),b=sc.nextInt();
        solve(a,b);
    }
    public static void solve(int a,int b) {
        a^=b;
        b^=a;
        a^=b;
        System.out.println(a+" "+b);
    }

}
