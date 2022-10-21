package LC_Medium2;
import java.util.*;
public class WC_266 {
    public int minimizedMaximum(int n, int[] quantities) {
        int l=1,r=0;
        for(int i:quantities) r=Math.max(i,r);
        if(n==1) return r;
        int sum=r;
        int res=r;
        while(l<=r) {
            int m=l+(r-l)/2;
            if(g(m,n,quantities)) {
                res=m;
                r=m-1;
            } else {
                l=m+1;
            }
        }
        return res;
    }
    public boolean g(int m,int n,int[] a) {
        int cnt=0;
        for(int i:a) {
            int j=i;
            while(j>=m) {
                j-=m;
                cnt++;
                if(cnt>n) return false;
            }
            if(j!=0) cnt++;
            if(cnt>n) return false;
        }
        return true;
    }

}
