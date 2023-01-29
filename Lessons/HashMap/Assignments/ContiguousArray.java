package Lessons.HashMap.Assignments;
import java.util.*;
public class ContiguousArray {
    public int findMaxLength(int[] nums) {
        Map<Integer,Integer>map=new HashMap<>();
        map.put(0,-1);
        int max=0,s=0;
        for(int i=0;i<nums.length;++i) {
            nums[i]=nums[i]==0?-1:1;
            s+=nums[i];
            if(map.get(s)!=null) {
                int left=map.get(s);
                max=Math.max(i-left,max);
                //System.out.println(max+" "+i);
            } else {
                 map.put(s,i);
            }
            //System.out.println(map);
        }
        return max;
    }
}
