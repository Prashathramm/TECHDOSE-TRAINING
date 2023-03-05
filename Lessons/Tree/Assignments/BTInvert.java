package Lessons.Tree.Assignments;
import java.util.*;
public class BTInvert {
    public TreeNode invertTree(TreeNode root) {
        if(root==null) return null;
        bfs(root);
        return root;
    }
    public void bfs(TreeNode root) {
        Queue<TreeNode>q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()) {
            int s=q.size();
            for(int i=0;i<s;++i) {
                TreeNode rem=q.remove();
                TreeNode l=null,r=null;
                if(rem.left!=null) {
                    l=rem.left;
                    q.add(rem.left);
                }
                if(rem.right!=null) {
                    r=rem.right;
                    q.add(rem.right);
                }
                rem.left=r;
                rem.right=l;
            }
        }
    }
}
