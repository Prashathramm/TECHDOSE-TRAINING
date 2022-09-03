class Solution {
    public int[] countBits(int n) {
        int[] res=new int[n+1];
        int ctr=0;
        for(int i=0;i<=n;++i) {
            int v=i,count=0;
            while(v>0) {
                if((v&1)==1) {
                    count++;
                }
                v>>=1;
            }
            res[ctr++]=count;
        }
        return res;
    }
}