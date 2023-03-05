package Lessons.Tree.Assignments;
import java.util.*;
public class LCA {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        int a=p.val,b=q.val;
        return get(root,a,b);
    }
    public TreeNode get(TreeNode root,int p,int q) {
        if(root==null) return root;
        if(root.val==p || root.val==q) return root;
        TreeNode l=get(root.left,p,q);
        TreeNode r=get(root.right,p,q);
        if(l!=null && r!=null) {
            return root;
        }
        if(l!=null) {
            return l;
        } else {
            return r;
        }
    }
}
