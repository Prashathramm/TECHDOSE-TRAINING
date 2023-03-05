package Lessons.Backtracking.Assignments;
import java.util.*;
public class Permutations {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>>res=new ArrayList<>();
        boolean[] vis=new boolean[nums.length];
        rec(nums,res,0,vis,new ArrayList<>());
        return res;
    }
    public void rec(int[] n,List<List<Integer>>res,int idx,boolean[] vis,List<Integer>temp) {
        if(idx==n.length) {
            res.add(new ArrayList<>(temp));
            return;
        }
        for(int i=0;i<n.length;++i) {
            if(!vis[i]) {
                temp.add(n[i]);
                vis[i]=true;
                rec(n,res,idx+1,vis,temp);
                temp.remove(temp.size()-1);
                vis[i]=false;
            }
        }
    }   
}
