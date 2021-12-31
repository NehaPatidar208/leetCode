# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def helper(self,root,mx,la,ha):
        if not root:
            return mx
        mx=max(mx, abs(root.val-la), abs(root.val-ha))
        if la>root.val:
            la=root.val
        if ha<root.val:
            ha=root.val
        if root.left:
            mx = max(mx,self.helper(root.left,mx,la,ha))
        if root.right:
            mx= max(mx,self.helper(root.right,mx,la,ha))
        return mx
    def maxAncestorDiff(self, root: Optional[TreeNode]) -> int:
        return self.helper(root,-1,root.val,root.val)
        
