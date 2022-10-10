import java.util.*;
public class Selection {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;++i) 
            a[i]=sc.nextInt();
        solve(n,a);
    }
    public static void solve(int n,int[] a) {
        for(int i=0;i<=n-2;++i) {
            int min=i;
            for(int j=i+1;j<n;++j) {
                if(a[j]<a[min]) 
                    min=j;
            }
            swap(i,min,a);
        }
        System.out.println(Arrays.toString(a));
    }
    public static void swap(int i,int j,int[] a) {
        int t=a[i];
        a[i]=a[j];
        a[j]=t;
    }
}
