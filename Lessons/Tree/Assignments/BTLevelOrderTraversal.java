package Lessons.Tree.Assignments;
import java.util.*;
public class BTLevelOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root==null) return new ArrayList<>();
        Queue<TreeNode>q=new LinkedList<>();
        List<List<Integer>>l=new ArrayList<>();
        List<Integer>t=new ArrayList<>();
        q.add(root);
        int cnt1=1,cnt2=0;
        while(q.size()>0) {
            TreeNode r=q.remove();
            t.add(r.val);
            cnt1--;
            if(r.left!=null) {
                q.add(r.left);
                cnt2++;
            }
            if(r.right!=null) {
                q.add(r.right);
                cnt2++;
            }
            if(cnt1==0) {
                l.add(new ArrayList<>(t));
                t.clear();
                cnt1=cnt2;
                cnt2=0;
            }
        }
        return l;
    }
}
