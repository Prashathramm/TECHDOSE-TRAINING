package LC_Medium3;
import java.util.*;
public class BW_65 {
    public int[] maximumBeauty(int[][] items, int[] queries) {
        Arrays.sort(items,(a,b)->Integer.compare(a[0],b[0]));
        int n=items.length;
        int[] max=new int[n];
        max[0]=items[0][1];
        for(int i=1;i<n;++i) {
            max[i]=Math.max(max[i-1],items[i][1]);
        }
        int[] res=new int[queries.length];
        int j=0;
        System.out.println(Arrays.deepToString(items));
        for(int i:queries) {
            int l=0,r=n-1,idx=-1;
            while(l<=r) {
                int m=l+(r-l)/2;
                if(items[m][0]<=i) {
                    l=m+1;
                } else {
                    idx=m;
                    r=m-1;
                }
            }
            if(idx>0 && items[idx][0]>i) {
                res[j]=max[idx-1];
            } else if(idx<0) {
                res[j]=max[n-1];
            }
            j++;
        }
        return res;
    }
    
}
