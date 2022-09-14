import java.util.*;
public class ToUpper {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char ch=sc.next().charAt(0);
        solve(ch);
    }
    public static void solve(char ch) {
        System.out.print((char)(ch&95));
    }
}
