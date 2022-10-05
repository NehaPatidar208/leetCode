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
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        
        if(depth <1)return root;
        if(depth==1){
            TreeNode node = new TreeNode(val);
            node.left = root;
            return node;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while(depth-->2){
            int t=q.size();
            for(int i=0;i<t;i++){
                TreeNode cur = q.poll();
                if(cur.left!=null)q.offer(cur.left);
                if(cur.right!=null)q.offer(cur.right);
            }
        }
        while(!q.isEmpty()){
            TreeNode node1 = new TreeNode(val);
            TreeNode cur = q.poll();
            if(cur.left!=null){
                node1.left = cur.left;
            }
            cur.left = node1;
            TreeNode node2 = new TreeNode(val);
            if(cur.right!=null){
                node2.right = cur.right;
            }
            cur.right=node2;
        }
        return root;
    }
}
