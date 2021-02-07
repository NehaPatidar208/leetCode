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
        Queue<TreeNode> q=new LinkedList<>();
        List<Integer> result=new ArrayList<>();
        q.add(root);
        q.add(null);
        int pre= -1;
        while(q.isEmpty()!=true){
            TreeNode temp=q.poll();
            if(temp !=null){
                pre=temp.val;
                if(temp.left !=null)q.add(temp.left);
                if (temp.right !=null)q.add(temp.right);
            }
            else{
                result.add(pre);
                if(!q.isEmpty())q.add(null);
            }
        }
        return result;
    }
}
