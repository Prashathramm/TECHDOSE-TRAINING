package Lessons.Tree.Assignments;
import java.util.*;
public class CountGoodNodes {
    int res;
    public int goodNodes(TreeNode root) {
        res=0;
        get(root,(int)-1e8);
        return res;
    }
    public void get(TreeNode root,int max) {
        if(root==null) {
            return;
        }
        if(root.val>=max) res+=1;
        max=Math.max(root.val,max);
        get(root.left,max);
        get(root.right,max);
    }
}
