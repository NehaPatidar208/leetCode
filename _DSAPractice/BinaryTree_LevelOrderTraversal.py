# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def levelOrder(self, root: Optional[TreeNode]) -> List[List[int]]:
        if not root:
            return []
        l=[]
        q=deque()
        q.append(root)
        while q:
            ln= len(q)
            tmp=[]
            for i in range(ln):    
                r=q.popleft()
                tmp.append(r.val)
                if r.left:
                    q.append(r.left)
                if r.right:
                    q.append(r.right)
            l.append(tmp)
        return l
        
