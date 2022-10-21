package LC_Medium2;

public class WC_263 {
    public int countMaxOrSubsets(int[] nums) {
        int n=nums.length;
        Set<Integer>set=new HashSet<>();
        for(int i:nums) {
            for(int j=0;j<32;++j) {
                if((i&(1<<j))!=0) set.add(j);
            }
        }
        int max=0,res=0;
        for(int i:set) {
            max|=(1<<i);
        }
        for(int i=1;i<(1<<n);++i) {
            int or=0;
            for(int j=0;j<n;++j) {
                if((i&(1<<j))!=0) {
                    or|=nums[j];
                }
            }
            if(or==max) res++;
        }
        return res;
    }
    
}
