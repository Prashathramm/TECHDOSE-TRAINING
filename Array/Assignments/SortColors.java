package Array.Assignments;

public class SortColors {
    public void sortColors(int[] nums) {
        int i=0,j=0,k=nums.length-1;
        while(i<=k) {
            if(nums[i]==0) {
                s(i,j,nums);
                i++;
                j++;
            } else if(nums[i]==1) {
                i++;
            } else {
                s(i,k,nums);
                k--;
            }
        }
    }
    public static void s(int i,int j,int[] a) {
        int t=a[i];
        a[i]=a[j];
        a[j]=t;
    }
    
}
