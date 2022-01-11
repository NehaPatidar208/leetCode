# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def isSymmetric(self, root: Optional[TreeNode]) -> bool:
        if not root or ( not root.left and not root.right):
            return True
        r=root.right
        l=root.left
        def fun(r,l):
            
            if not r and not l:
                return True
            if (not r and l) or (r and not l):
                return False
            if r.val != l.val:
                return False
            f1= fun(r.left,l.right)
            f2=fun(r.right, l.left)
            if f1 and f2: return True 
            return False
        
            
            
        return fun(r,l)
            
        
