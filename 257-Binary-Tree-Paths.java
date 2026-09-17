/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    List<String> ans = new ArrayList<>();
    List<String> t = new ArrayList<>();
    public List<String> binaryTreePaths(TreeNode root) {
        dfs(root);
        return ans;
    }
    public void dfs(TreeNode node){
        if(node == null) return;

        t.add(node.val+"");
        if(node.left == null && node.right == null){
            ans.add(String.join("->",t));
        }
        else{
            dfs(node.left);
            dfs(node.right);
        }
        t.remove(t.size()-1);
   }
}