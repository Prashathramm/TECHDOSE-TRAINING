import java.util.*;
public class Merge {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;++i) 
            a[i]=sc.nextInt();
        solve(n,a);
        System.out.println(Arrays.toString(a));
    }
    public static void solve(int n,int[] a) {
        if(n==1) {
            return;
        }
        int mid=n/2;
        int[] m1=new int[mid],m2=new int[n-mid];
        int j=0;
        for(int i=0;i<mid;++i) 
            m1[i]=a[i];
        for(int i=mid;i<n;++i) 
            m2[j++]=a[i];
        solve(mid,m1);
        solve(n-mid,m2);
        sort(m1,m2,a);
    }
    public static void sort(int[] m1,int[] m2,int[] a) {
        int n1=m1.length,n2=m2.length;
        int i=0,j=0,k=0;
        while(i<n1 && j<n2) {
            if(m1[i]<m2[j]) {
                a[k++]=m1[i];
                i++;
            } else {
                a[k++]=m2[j];
                j++;
            }
        }
        while(i<n1) {
            a[k++]=m1[i];
            i++;
        }
        while(j<n2) {
            a[k++]=m2[j];
            j++;
        }
    }
}
