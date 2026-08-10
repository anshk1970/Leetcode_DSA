class Solution {
    public boolean isSymmetric(TreeNode root) {
        invertTree(root.left);
        return isSameTree(root.left,root.right);
    }
    public boolean isSameTree(TreeNode p , TreeNode q){
        if(p==null && q==null) return true;
        if(p==null || q==null) return false;
        if(p.val != q.val) return false;
        return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
    }
    void invertTree(TreeNode root){
        if(root==null) return;
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        invertTree(root.left);
        invertTree(root.right);
    }
}