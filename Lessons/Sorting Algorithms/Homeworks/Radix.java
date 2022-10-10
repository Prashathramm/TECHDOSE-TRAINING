import java.util.*;
public class Radix {
    static int RANGE=10,max_dig=0;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;++i) {
            arr[i]=sc.nextInt();
            max_dig=Math.max(max_dig,arr[i]);
        }
        max_dig=d(max_dig);
        solve(arr,n,10);
        System.out.println(Arrays.toString(solve(arr,n,10)));
    }
    public static int[] solve(int[] arr,int n,int pos) {
        if(d(pos)==max_dig+2) return arr;
        int[] fre=new int[RANGE];
        int[] s_arr=new int[n];
        for(int i=0;i<n;++i) {
            fre[(arr[i]%pos)/(pos/10)]++;
        }
        for(int i=1;i<RANGE;++i) {
            fre[i]+=fre[i-1];
        }
        for(int i=0;i<n;++i) {
            s_arr[fre[(arr[i]%pos)/(pos/10)]-1]=arr[i];
            fre[(arr[i]%pos)/(pos/10)]--;
        }
        return solve(s_arr,n,pos*10);
    }
    public static int d(int n) {
        return (int)(Math.log10((double)n)+1);
    }
}
