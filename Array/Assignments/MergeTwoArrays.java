package Array.Assignments;

public class MergeTwoArrays {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(m==0 && n==0) return;
        if(n==0) return;
        int i=m-1,j=n-1,k=m+n-1;
        while(k>=0) {
            int v1=i>=0?nums1[i]:Integer.MIN_VALUE;
            int v2=j>=0?nums2[j]:Integer.MIN_VALUE;
            if(v1>=v2) {
                nums1[k]=v1;
                k--;
                i--;
                
            } else {
                nums1[k]=v2;
                k--;
                j--;
            }
        }
    }
    
}
