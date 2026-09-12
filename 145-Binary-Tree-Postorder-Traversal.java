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
    private void postorderTraversal(TreeNode node, List l){
        if(node == null){
            return;
        }
        postorderTraversal(node.left,l);
        postorderTraversal(node.right,l);
        l.add(node.val);
    }
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> postOrder = new ArrayList<>();
        postorderTraversal(root,postOrder);
        return postOrder;
    }
}