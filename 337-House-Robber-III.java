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
    public int max(int[] arr){
        int max = arr[0];
        if(arr[1]>arr[0]){
            max = arr[1];
        }
        return max;
    }

    public int[] helper(TreeNode node){
        if(node == null){
            return new int[] {0,0};
        }

        int[] leftRob = new int[2];
        int[] rightRob = new int[2];

        leftRob = helper(node.left);
        rightRob = helper(node.right);

        int with = node.val+leftRob[1]+rightRob[1];
        int without = max(leftRob) + max(rightRob);

        return new int[] {with,without};
    }
    public int rob(TreeNode root) {
        return max(helper(root));
    }
}