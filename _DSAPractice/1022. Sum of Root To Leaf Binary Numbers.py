# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def helper(self,r,sm,st):
        st= st+str(r.val)
        if not r.left and not r.right:     
            return sm+int(st,2)
        if r.left:
            sm=self.helper(r.left,sm,st)
        if r.right:
            sm=self.helper(r.right,sm,st)
        return sm
    def sumRootToLeaf(self, root: Optional[TreeNode]) -> int:
        return self.helper(root,0, '')
        
