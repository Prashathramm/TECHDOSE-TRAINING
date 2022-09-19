import java.util.*;
public class Quick {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;++i) 
            arr[i]=sc.nextInt();
        solve(0,n-1,arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void solve(int l,int r,int[] arr) {
        if(l>=r) {
            return;
        }
        int pivotIdx=getPivot(l,r,arr);
        solve(l,pivotIdx-1,arr);
        solve(pivotIdx+1,r,arr);
    }
    public static int getPivot(int l,int r,int[] arr) {
        int i=l-1,pivot=arr[r];
        for(int j=l;j<r;++j) {
            if(arr[j]<pivot) {
                i++;
                int t=arr[i];
                arr[i]=arr[j];
                arr[j]=t;
            }
        }
        i++;
        int t=arr[i];
        arr[i]=arr[r];
        arr[r]=t;
        return i;
    }
}
