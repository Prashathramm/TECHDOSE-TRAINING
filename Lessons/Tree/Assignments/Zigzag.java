package Lessons.Tree.Assignments;
import java.util.*;
public class Zigzag {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>>res=new ArrayList<>();
        if(root==null) return res;
        Queue<TreeNode>q=new LinkedList<>();
        q.add(root);
        int f=0;
        List<Integer>temp;
        while(!q.isEmpty()) {
            int s=q.size();
            temp=new ArrayList<>();
            while(s-->0) {
                TreeNode r=q.remove();
                if(f==0) temp.add(r.val);
                else temp.add(0,r.val);
                if(r.left!=null) q.add(r.left);
                if(r.right!=null) q.add(r.right);
            }
            res.add(temp);
            f^=1;
        }  
        return res;
    }   
}
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
