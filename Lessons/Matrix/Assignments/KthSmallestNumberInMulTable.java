package Matrix.Assignments;

public class KthSmallestNumberInMulTable {
    public int findKthNumber(int m, int n, int k) {
        int l=1,r=m*n;
        int res=0;
        while(l<=r) {
            int mid=l+(r-l)/2;
            int cnt=c(m,n,mid);
            if(cnt>=k) {
                res=mid;
                r=mid-1;
            } else {
                l=mid+1;
            }
        }
        return res;
    }
    public int c(int r,int c,int mid) {
        int row=0,col=c-1;
        int ret=0;
        while(row<r && col>-1) {
            int val=(row+1)*(col+1);
            if(val<=mid) {
                ret+=(col+1);
                row+=1;
            } else {
                col-=1;
            }
        }
        return ret;
    }
    
}
