package Array.Assignments;

public class CapacityOfShip {
    public int shipWithinDays(int[] weights, int days) {
        int l=-1,r=0;
        for(int i:weights) {
            l=Math.max(i,l);
            r+=i;
        }
        int res=0;
        while(l<=r) {
            int m=l+(r-l)/2;
            int sum=0,d=0;
            for(int i:weights) {
                sum+=i;
                if(sum>m) {
                    d++;
                    sum=i;
                }
            }
            if(d<days) {
                res=m;
                r=m-1;
            } else {
                l=m+1;
            }
        }
        return res;
    }
    
}
