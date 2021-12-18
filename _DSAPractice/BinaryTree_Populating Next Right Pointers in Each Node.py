"""
# Definition for a Node.
class Node:
    def __init__(self, val: int = 0, left: 'Node' = None, right: 'Node' = None, next: 'Node' = None):
        self.val = val
        self.left = left
        self.right = right
        self.next = next
"""

class Solution:
    def connect(self, root: 'Optional[Node]') -> 'Optional[Node]':
        if not root:
            return None
        q= deque()
        q.append(root)
        while q:
            c= len(q)
            for i in range (c):
                r=q.popleft()
                if r.left:
                    q.append(r.left)
                if r.right:
                    q.append(r.right)
                if i == 0:
                    pre = r   
                elif i != 0 :
                    pre.next = r
                    pre=pre.next
                if i == c-1:
                    pre.next = None
        return root
        
