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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(root == null || subRoot == null) return root==subRoot;

        if(root.val == subRoot.val && isIdentical(root,subRoot)){
            return true;
        }
        return isSubtree(root.left,subRoot) || isSubtree(root.right,subRoot);
    }
    public boolean isIdentical(TreeNode root, TreeNode subroot){
        if(root == null || subroot == null){
            return root == subroot;
        }
        boolean identicalLeft = isIdentical(root.left,subroot.left);
        boolean identicalRight = isIdentical(root.right,subroot.right);

        return identicalLeft && identicalRight && root.val == subroot.val;
    }
}