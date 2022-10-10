package Array.Assignments;

public class RangeSumQuery {
    int[] arr;
    public void NumArray(int[] nums) {
        arr=new int[nums.length];
        arr[0]=nums[0];
        for(int i=1;i<nums.length;++i) arr[i]=arr[i-1]+nums[i];
    }
    
    public int sumRange(int left, int right) {
        return arr[right]-(left-1<0?0:arr[left-1]);
    }
    
}
