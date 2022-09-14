import java.util.*;
public class EucledianForGCD {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt(),b=sc.nextInt();
        solve(a,b);
    }
    public static void solve(int a,int b) {
        System.out.print(find(a,b));
    }
    public static int find(int a,int b) {
        if(a==0) return b;
        return find(b%a,a);
    }
}
