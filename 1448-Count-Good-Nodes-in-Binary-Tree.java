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
    int count = 0;
    public void helper(TreeNode node, int max){
        if(node == null) return;
        if(max<=node.val){
            count++;
        }
        helper(node.left,Math.max(max,node.val));
        helper(node.right,Math.max(max,node.val));
    }
    public int goodNodes(TreeNode root) {
        helper(root,root.val);
        return count;
    }
}