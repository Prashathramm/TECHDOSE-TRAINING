class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer>map=new HashMap<>();
        int idx=0;
        for(int i:nums) {
            int j=target-i;
            if(map.get(j)==null) {
                map.put(i,idx);
            } else {
                return new int[]{idx,map.get(j)};
            }
            idx++;
        }
        return new int[]{};
    }
}