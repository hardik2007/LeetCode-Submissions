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
class FindElements {
    private final Set<Integer> values = new HashSet<>();
    public void Make(TreeNode root, int val){
         if(root == null) return;

         root.val = val;
         values.add(val);
         Make(root.left,(2*root.val)+1);
         Make(root.right,(2*root.val)+2);   
        }
    public FindElements(TreeNode root) {
        Make(root,0);
    }
    
    public boolean find(int target) {
        return values.contains(target);
    }
}

/**
 * Your FindElements object will be instantiated and called as such:
 * FindElements obj = new FindElements(root);
 * boolean param_1 = obj.find(target);
 */