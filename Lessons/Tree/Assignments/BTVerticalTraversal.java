package Lessons.Tree.Assignments;
import java.util.*;
public class BTVerticalTraversal {
    Map<Integer,List<int[]>>map=new TreeMap<>();
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        map.putIfAbsent(0,new ArrayList<int[]>());
        map.get(0).add(new int[]{0,root.val});
        t(root.left,1,-1);
        t(root.right,1,1);
        List<List<Integer>>res=new ArrayList<>();
        for(int i:map.keySet()) {
            Collections.sort(map.get(i),(a,b)->{
                if(a[0]==b[0]) return a[1]-b[1];
                return a[0]-b[0];
            });
        }
        List<Integer>temp=new ArrayList<>();
        for(int i:map.keySet()) {
            for(int[] j:map.get(i)) {
                temp.add(j[1]);
            }
            res.add(new ArrayList<>(temp));
            temp.clear();
        }
        return res;
    }
    public void t(TreeNode root,int r,int c) {
        if(root==null) {
            return;
        }
        map.computeIfAbsent(c,l->new ArrayList<>()).add(new int[]{r,root.val});
        t(root.left,r+1,c-1);
        t(root.right,r+1,c+1);
    }
}
