class SingelNumber2 {
    public int singleNumber(int[] nums) {
        int o=0,t=0;
        for(int i=0;i<nums.length;++i) {
            o=(~t)&(o^nums[i]);
            t=(~o)&(t^nums[i]);
        }
        return o;
    }
}