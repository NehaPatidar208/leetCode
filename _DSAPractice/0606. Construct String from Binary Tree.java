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
    String result="";
    public void helper(TreeNode root){
        if (root == null)return;
        result+=String.valueOf(root.val);
        if(root.left !=null || root.right !=null){
            result+="(";
            helper(root.left);
            result+=")";
        }
        if(root.right !=null){
            result+="(";
            helper(root.right);
            result+=")";
        }
        
    }
    public String tree2str(TreeNode root) {
        helper(root);
        return result;
    }
}
