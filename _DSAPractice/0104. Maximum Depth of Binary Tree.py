# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def maxDepth(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        q= deque()
        q.append(root)
        res=0
        while q:
            res = res+1
            t=len(q)
            print(t)
            for i in range (t):  
                g=q.popleft()
                if g.left:
                    q.append(g.left)
                    #print(g.left.val,len(q))
                if g.right:
                    q.append(g.right)
                    #print(g.right.val,len(q))
                    
        return res
            
            
        
