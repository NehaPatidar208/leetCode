# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def helper(self, r ,t,v):
        if (not r.left and not r.right):
            if v+r.val==t:
                return True
            else: return False
        a=False
        b=False
        if r.left:
            a = self.helper(r.left,t,v+r.val)
        if r.right:
            b = self.helper(r.right,t,v+r.val)
        return a or b
    def hasPathSum(self, root: Optional[TreeNode], targetSum: int) -> bool:
        if not root: return False
        return self.helper(root,targetSum , 0)
        
