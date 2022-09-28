package Array.Assignments;

public class LargestSumConSubarray {
    public int maxSubArray(int[] nums) {
        int s=0,max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;++i) {
            s+=nums[i];
            if(s>max) {
                max=s;
            }
            if(s<0) {
                s=0;
            }
        }
        return max;
    }
}
