# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:            
    def insertIntoBST(self, root: Optional[TreeNode], val: int) -> Optional[TreeNode]:
        node= TreeNode(val)
        if not root:
            return node
        t= root
        while root:
            if root.val>=val:
                if root.left:
                    root=root.left
                    continue
                else:
                    root.left = node
                    return t
            else:
                if root.right:
                    root=root.right
                    continue
                else:
                    root.right=node
                    return t
        return t
                    
                
