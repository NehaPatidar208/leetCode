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
    public List<Integer> rightSideView(TreeNode root) {
        if (root==null)return new ArrayList<Integer>();
        Queue<TreeNode>q = new LinkedList();
        List<Integer>result=new LinkedList<>();
        int prev= -1;
        q.offer(root);
        q.offer(null);
        while(!q.isEmpty()){
            TreeNode cur = q.poll();
            if(cur == null){
                result.add(prev);
                if(!q.isEmpty())q.offer(null);
            }else{
                prev= cur.val;
                if(cur.left != null)q.offer(cur.left);
                if(cur.right != null)q.offer(cur.right);
            }
        }
        return result;
    }
}
