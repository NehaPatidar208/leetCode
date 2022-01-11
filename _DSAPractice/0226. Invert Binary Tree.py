# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def invertTree(self, root: Optional[TreeNode]) -> Optional[TreeNode]:
        if not root or (not root.left and not root.right):
            return root
        d=deque()
        d.append(root)
        while d:
            g=d.popleft()
            g.left,g.right = g.right,g.left
            if(g.left):
                d.append(g.left)
            if g.right:
                d.append(g.right)
        return root
        
