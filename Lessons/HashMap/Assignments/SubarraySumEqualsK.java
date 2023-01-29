package Lessons.HashMap.Assignments;
import java.util.*;
public class SubarraySumEqualsK {
    public int subarraySum(int[] nums, int k) {
        int res=0,s=0;
        Map<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<nums.length;++i) {
            s+=nums[i];
            if(s==k) res++;
            if(map.get(s-k)!=null) res+=map.get(s-k);
            map.put(s,map.getOrDefault(s,0)+1);
        }
        return res;
    }
}
