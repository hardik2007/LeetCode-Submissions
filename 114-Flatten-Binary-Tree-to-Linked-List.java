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
    public void preOrder(Queue<TreeNode> q, TreeNode root){
        if(root == null){
            return;
        }
        q.add(root);
        preOrder(q,root.left);
        preOrder(q,root.right);
    }
    public void flatten(TreeNode root) {
        if(root == null) return;
        Queue<TreeNode> q = new LinkedList<>();
        preOrder(q,root);
        TreeNode current = q.poll();
        while(!q.isEmpty()){
            TreeNode next = q.poll();
            current.left = null;
            current.right = next;
            current = next;
        }
    }
}