import java.util.*;
public class Insertion {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;++i) 
            a[i]=sc.nextInt();
        solve(n,a);
    }    
    public static void solve(int n,int[] a) {
        for(int move=1;move<n;++move) {
            int val=a[move],j=0;
            for(j=move-1;j>-1;--j) {
                if(val<a[j]) {
                    a[j+1]=a[j];
                } else {
                    break;
                }
            }
            a[j+1]=val;
        }
        System.out.println(Arrays.toString(a));
    }
}
