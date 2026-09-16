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
import java.util.Vector;
class Solution {
    int count = 0;
    public TreeNode helper(TreeNode root, int k){
        if(root == null) return null;
        
        TreeNode left = helper(root.left,k);
        if(left!=null){
            return left;
        }
        count++;
        if(count == k){
            return root;
        }

        return helper(root.right,k);
    }
    
    public int kthSmallest(TreeNode root, int k) {
        if(root == null) return 0;
        return helper(root,k).val;
}
}