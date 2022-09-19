class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] arr=new int[nums1.length+nums2.length];
        int i=0,j=0,k=0;
        while(i<nums1.length && j<nums2.length) {
            if(nums1[i]<nums2[j]) {
                arr[k++]=nums1[i];
                i++;
            } else {
                arr[k++]=nums2[j];
                j++;
            }
        }
        while(i<nums1.length) {
            arr[k++]=nums1[i++];
        }
        while(j<nums2.length) {
            arr[k++]=nums2[j++];
        }
        if(arr.length%2==0) {
            int l=(arr.length-1)/2,r=l+1;
            return (double)(arr[l]+arr[r])/2;
        } else {
            return arr[(arr.length)/2];
        }
    }
}
