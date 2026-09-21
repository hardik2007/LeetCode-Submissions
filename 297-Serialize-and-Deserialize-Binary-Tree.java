/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {
    int i = 0;
    public void dfs(TreeNode node, List<String> result){
        if(node == null){
            result.add("N");
            return;
        }
        result.add(String.valueOf(node.val));
        dfs(node.left,result);
        dfs(node.right,result);
    }
    public String serialize(TreeNode root) {
        List<String> result = new ArrayList<>();
        dfs(root,result);
        return String.join(",",result);
    }

    public TreeNode deserial(String[] r){
        if(r[i].equals("N")){
            i++;
            return null;
        }
        TreeNode root = new TreeNode(Integer.parseInt(r[i]));
        i++;
        root.left = deserial(r);
        root.right = deserial(r);
        return root;
    }
    public TreeNode deserialize(String data) {
        String[] r = data.split(",");
        this.i = 0;
        return deserial(r);
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));