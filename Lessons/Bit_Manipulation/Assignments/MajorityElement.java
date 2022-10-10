class MajorityElement {
    public int majorityElement(int[] nums) {
        int cnt=0,maj=nums[0];
        for(int i=0;i<nums.length;++i) {
            if(nums[i]==maj) {
                cnt++;
            } else if(cnt==0) {
                cnt=1;
                maj=nums[i];
            } else {
                cnt--;
            }
        } 
        return maj;
    }
}