class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] ret=new int[nums.length];
        ret[0]=1;
        for(int i=1;i<nums.length;++i) {
            ret[i]=ret[i-1]*nums[i-1];
        }
        int cnt=1;
        for(int i=nums.length-1;i>-1;--i) {
            ret[i]=ret[i]*cnt;
            cnt=cnt*nums[i];
        }
        return ret;
    }
}