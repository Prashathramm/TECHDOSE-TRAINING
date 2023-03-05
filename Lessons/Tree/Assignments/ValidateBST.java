package Lessons.Tree.Assignments;
import java.util.*;
public class ValidateBST {
    public boolean isValidBST(TreeNode root) {
        return isV(root,(long)-1e10,(long)1e10);
    }
    public boolean isV(TreeNode root,long max,long min) {
        if(root==null) return true;
        if((long)root.val<=max || (long)root.val>=min) return false;
        return isV(root.left,max,root.val) && isV(root.right,root.val,min);
    }
}
