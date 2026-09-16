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
    public void inOrder(TreeNode node, Vector<Integer> ans){
        if(node == null) return;

        inOrder(node.left,ans);
        ans.add(node.val);
        inOrder(node.right,ans);
    }
    public int kthSmallest(TreeNode root, int k) {
        if(root == null) return 0;
        Vector<Integer> ans = new Vector<>();

        inOrder(root,ans);
        
        return ans.get(k-1);
    }
}