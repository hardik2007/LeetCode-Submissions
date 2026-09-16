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
    private int helper(TreeNode node, int s){
        if(node == null) return 0;

        s = s*10 + node.val;

        if(node.left == null && node.right == null){
            return s;
        }
        return helper(node.left,s) + helper(node.right,s);
    }
    public int sumNumbers(TreeNode root) {
        return helper(root,0);
    }
}