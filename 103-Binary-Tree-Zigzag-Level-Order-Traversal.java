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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if(root == null) return res;

        Deque<TreeNode> q = new LinkedList<>();
        q.offer(root);

        boolean reverse = false;
        while(!q.isEmpty()){
            int levelSize = q.size();
            List<Integer> currentList = new ArrayList<>(levelSize);
            for(int i=0;i<levelSize;i++){
                if(!reverse){
                    TreeNode current = q.poll();
                    currentList.add(current.val);
                    if(current.left !=null){
                        q.offer(current.left);
                    }
                    if(current.right != null){
                        q.offer(current.right);
                    }
                }
                else{
                    TreeNode current = q.pollLast();
                    currentList.add(current.val);
                    if(current.right != null){
                        q.addFirst(current.right);
                    }
                    if(current.left != null){
                        q.addFirst(current.left);
                    }
                }
            }
            reverse = !reverse;
            res.add(currentList);
        }
        return res;
    }
}