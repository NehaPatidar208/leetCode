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
    static void helper(TreeNode root,List<Integer>l){
        if(root.left == null && root.right == null){l.add(root.val);}
        if(root.left!=null)helper(root.left,l);
        if(root.right!=null)helper(root.right,l);
    }
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer>l1 = new ArrayList<Integer>();
        List<Integer>l2 = new ArrayList<Integer>();
        if(root1!=null)helper(root1,l1);
        if(root2!=null)helper(root2,l2);
        //System.out.println(l1.size() + " "+ l2.size());
        if(l1.size() != l2.size())return false;
        for(int i=0;i<l1.size();i++){
            //System.out.println(l1.get(i) +" "+ l2.get(i));
            if(l1.get(i) != l2.get(i)) return false;
        }
        return true;
    }
}
