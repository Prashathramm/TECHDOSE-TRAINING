package Array.Homeworks;
import java.util.*;
public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;++i) a[i]=sc.nextInt();
        int target=sc.nextInt();
        System.out.println(search(a,target));
    }
    public static int search(int[] a,int t) {
        Arrays.sort(a);
        int l=0,r=a.length-1;
        while(l<=r) {
            int m=l+(r-l)/2;
            if(a[m]==t) return m;
            if(a[m]<t) {
                l=m+1;
            } else {
                r=m-1;
            }
        }
        return -1;
    }    
}

