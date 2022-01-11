# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def helper(self, root,v):
        if not root:
            return root
        if(root.val == v): return root
        temp=root
        if root.val >v:
            temp = self.helper(root.left,v)
        elif root.val<v:
            temp = self.helper(root.right,v)
        return temp
    def searchBST(self, root: Optional[TreeNode], val: int) -> Optional[TreeNode]:
        if not root:
            return  root
        return self.helper(root,val)
        
