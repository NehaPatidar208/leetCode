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
    int nodecount =0;
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        LinkedList<TreeNode> que = new LinkedList<>();
        String s ="";
        que.offer(root);
        while(!que.isEmpty()){
            nodecount++;
            TreeNode node = que.poll();
            if(node == null) s+="#,";
            else{
                s+=String.valueOf(node.val+",");
                que.offer(node.left);
                que.offer(node.right);
            }
        }
        //System.out.println(s);
        return s.substring(0,s.length()-1);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if(data.charAt(0) == '#')return null;
        LinkedList<TreeNode> que = new LinkedList<>();
        String str[] = data.split(",", nodecount);
        TreeNode root = new TreeNode(Integer.parseInt(str[0]));
        que.offer(root);
        int i=1;
        while(i<str.length){
            TreeNode cur = que.poll();
            if(!str[i].equals("#")){
                cur.left = new TreeNode(Integer.parseInt(str[i]));
                que.offer(cur.left);
            }else{
                cur.left = null;
            }
            i++;
            if(!str[i].equals("#")){
                cur.right = new TreeNode(Integer.parseInt(str[i]));
                que.offer(cur.right);
            }else{
                cur.right = null;
            }
            i++;
        }
        return root;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));
