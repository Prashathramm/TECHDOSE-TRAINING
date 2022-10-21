package LC_Medium3;
import java.util.*;
public class BW_61 {
    public long maxTaxiEarnings(int n, int[][] rides) { 
        long[] dp=new long[(int)1e5];
        Arrays.fill(dp,-1L);
        Arrays.sort(rides,(a,b)->Integer.compare(a[0],b[0]));
        return rec(dp,rides,0);
    }
    public long rec(long[] dp,int[][] rides,int idx) {
        if(idx<0 || (idx>=rides.length)) {
            return 0;
        }
        if(dp[idx]!=-1) return dp[idx];
        long not_pick=rec(dp,rides,idx+1);
        int pos=search(rides[idx][1],rides,idx);
        long pick=rides[idx][1]-rides[idx][0]+rides[idx][2]+rec(dp,rides,pos);
        return dp[idx]=Math.max(pick,not_pick);
    }
    public int search(int val,int[][] rides,int idx) {
        int l=idx,r=rides.length-1;
        int res=-1;
        while(l<=r) {
            int m=l+(r-l)/2;
            if(rides[m][0]>=val) {
                res=m;
                r=m-1;
            } else {
                l=m+1;
            }
        }
        return res;
    }
}
