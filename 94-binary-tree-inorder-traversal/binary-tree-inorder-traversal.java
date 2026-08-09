class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> ans = new ArrayList<>();
        dfs(root,ans);
        return ans;
    }
    public void dfs(TreeNode root, ArrayList<Integer> ans){
        if(root==null) return;
        dfs(root.left,ans);
        ans.add(root.val);
        dfs(root.right,ans);
    }
}