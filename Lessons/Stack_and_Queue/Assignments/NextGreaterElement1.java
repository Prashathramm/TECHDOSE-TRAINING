package Stack_and_Queue.Assignments;

public class NextGreaterElement1 {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer>stk=new Stack<>();
        Map<Integer,Integer>map=new HashMap<>();
        boolean[] f=new boolean[nums2.length];
        int[] nextG=new int[nums2.length];
        int j=0;
        for(int i:nums2) map.put(i,j++); 
        j=0;
        stk.push(nums2[0]);
        int i=1,idx=0;
        while(i<nums2.length) {
            j=i;
            while(!stk.isEmpty() && stk.peek()<nums2[i]) {
                int t=stk.pop();
                if(f[--j]==false) {
                    f[j]=true;
                    nextG[j]=nums2[i];
                }
                idx=i;
            }
            stk.push(nums2[i]);
            i++;
        }
        for(i=idx;i<nums2.length;++i) if(!f[i]) nextG[i]=-1;
        System.out.println(Arrays.toString(nextG));
        j=0;
        int[] res=new int[nums1.length];
        for(int k:nums1) {
            res[j++]=nextG[map.get(k)];
        }
        return res;
    }
    
}
