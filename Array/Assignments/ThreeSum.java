package Array.Assignments;
import java.util.*;;
public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>>res=new ArrayList<>();
        Set<String>set=new HashSet<>();
        Map<Integer,Integer>map;
        for(int i=0;i<nums.length;++i) {
            int target=0-nums[i];
            map=new HashMap<>();
            for(int j=i+1;j<nums.length;++j) {
                int r=target-nums[j];
                if(map.get(r)==null) {
                    map.put(nums[j],j);
                } else {
                    if(set.add(nums[i]+""+r+nums[j])) 
                        res.add(Arrays.asList(nums[i],r,nums[j]));
                }
            }
        }
        return res;
    }
    
}
