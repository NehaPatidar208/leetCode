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
    int helper(TreeNode root, int temp){
        if(root == null)return 0;
        if(root.left == null && root.right == null )return temp*10+root.val;
        temp = temp*10+root.val;
        //System.out.println(root.val);
        return temp = helper(root.left, temp) + helper(root.right, temp);
    }
    public int sumNumbers(TreeNode root) {
        if(root == null)return 0;
        if(root.left == null && root.right == null )return root.val;
        return helper(root.left,root.val)+helper(root.right,root.val);
    }
}
