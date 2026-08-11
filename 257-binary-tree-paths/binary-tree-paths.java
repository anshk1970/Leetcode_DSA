class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<>();
        if (root != null) {
            dfs(root, "", result);
        }
        return result;
    }
    
    private void dfs(TreeNode node, String currentPath, List<String> result) {

        if (node == null) {
            return;
        }
        
        if (currentPath.isEmpty()) {
            currentPath += node.val;
        } else {
            currentPath += "->" + node.val;
        }
        
        if (node.left == null && node.right == null) {
            result.add(currentPath);
            return;
        }
        dfs(node.left, currentPath, result);
        dfs(node.right, currentPath, result);
    }
}