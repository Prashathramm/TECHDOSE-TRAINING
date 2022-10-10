import java.util.*;
public class LSBSetBit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        solve(n);
    }
    public static void solve(int n) {
        int pos=0;
        while(n>0) {
            if((n&1)==1) break;
            n>>=1;
            pos++;
        }
        System.out.print(pos);
    }

    
}
