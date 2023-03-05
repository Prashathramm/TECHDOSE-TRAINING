package Lessons.Tree.Assignments;
import java.util.*;
public class RightSideView {
    public List<Integer> rightSideView(TreeNode root) {
        if(root==null) return new ArrayList<>();
        List<Integer>res=new ArrayList<>();
        Queue<TreeNode>q=new LinkedList<TreeNode>();
        q.add(root);
        int c1=1,c2=0;
        while(q.size()>0) {
            TreeNode node=q.remove();
            c1--;
            if(node.left!=null) {
                c2++;
                q.add(node.left);
            } 
            if(node.right!=null) {
                c2++;
                q.add(node.right);
            }
            if(c1==0) {
                res.add(node.val);
                c1=c2;
                c2=0;
            }
        }
        return res;
    }
}
