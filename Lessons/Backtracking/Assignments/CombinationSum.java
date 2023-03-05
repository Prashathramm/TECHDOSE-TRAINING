package Lessons.Backtracking.Assignments;
import java.util.*;
public class CombinationSum {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>>res=new ArrayList<>();
        find(target,0,new ArrayList<>(),res,candidates);
        return res;
    }
    public static void find(int target,int ind,List<Integer>l,List<List<Integer>>res,int[] a) {
        if(ind==a.length) {
            return;
        }
        if(target==0) {
            res.add(new ArrayList<>(l));
            return;
        }
        if(a[ind]<=target) {
            l.add(a[ind]);
            find(target-a[ind],ind,l,res,a);
            l.remove(l.size()-1);
        }
        find(target,ind+1,l,res,a);
    }
}
