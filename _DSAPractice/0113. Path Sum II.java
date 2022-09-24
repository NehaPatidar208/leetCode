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
    void f(TreeNode root, int target,List<List<Integer>>result, List<Integer>dp){
        if(root==null)return;
        dp.add(root.val);
        if(target == root.val && root.left==null && root.right ==null){
            result.add(new ArrayList<Integer>(dp));
            dp.remove(dp.size()-1);
            return;
        }
        if(root.left!=null){
            f(root.left,target-root.val,result, dp);
        }
        if(root.right!=null){
            f(root.right,target-root.val,result,dp);
        }
        dp.remove(dp.size()-1);
    }
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        if(root==null)return new ArrayList<List<Integer>>();
        List<List<Integer>>result = new ArrayList<List<Integer>>();
        
        f(root,targetSum,result, new ArrayList<Integer>());
        return result;
    }
}
