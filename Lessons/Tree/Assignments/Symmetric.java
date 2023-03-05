package Lessons.Tree.Assignments;
public class Symmetric {
    public boolean isSymmetric(TreeNode root) {
        if(root==null) return true;
        return ifSym(root.left,root.right);
    }
    public boolean ifSym(TreeNode r1,TreeNode r2) {
        if(r1==null && r2==null) return true;
        if((r1==null || r2==null) || (r1.val!=r2.val)) return false;
        return ifSym(r1.left,r2.right) && ifSym(r1.right,r2.left);
    }   
}
