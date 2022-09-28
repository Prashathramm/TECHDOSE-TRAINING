package Array.Assignments;

public class KthLargest {
    public int findKthLargest(int[] nums, int k) {
        return f(nums,0,nums.length-1,nums.length-k);
    }
    public int f(int[] a,int l,int r,int k) {
        int pivot=part(a,l,r,k);
        if(pivot==k) return a[k];
        else {
            if(k<pivot) {
                return f(a,l,pivot-1,k);
            } else {
                return f(a,pivot+1,r,k);
            }
        }
    }
    public int part(int[] a,int l,int r,int k) {
        int i=-1,j=0,end=r;
        while(j<=r-1) {
            if(a[j]<=a[end]) {
                i++;
                s(j,i,a);
            }
            j++;
        }
        i++;
        s(i,r,a);
        return i;
    }
    public void s(int i,int j,int[] a) {
        int t=a[i];
        a[i]=a[j];
        a[j]=t;
    }
    
}
