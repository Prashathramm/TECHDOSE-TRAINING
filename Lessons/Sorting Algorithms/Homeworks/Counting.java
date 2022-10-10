import java.util.*;
public class Counting {
    static int RANGE=100;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] fre=new int[RANGE];
        int n=sc.nextInt();
        int[] arr=new int[n],res=new int[n];
        for(int i=0;i<n;++i)
            arr[i]=sc.nextInt();
        solve(arr,fre,res);
        System.out.println(Arrays.toString(res));
    }
    public static void solve(int[] arr,int[] fre,int[] res) {
        for(int i=0;i<arr.length;++i) {
            fre[arr[i]]++;
        }
        for(int i=1;i<100;++i)
            fre[i]+=fre[i-1];
            
        for(int i=0;i<arr.length;++i) {
            res[fre[arr[i]]-1]=arr[i];
            fre[arr[i]]--;
        }
    }
}
