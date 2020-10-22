# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
from collections import deque
def minimumDepth(curr):
  #Null node has 0 depth.
  if curr == None:
    return 0

  if curr.left == None and curr.right == None:
    return 1

  if not curr.left:
    return 1 + minimumDepth(curr.right)
  
  
  elif not curr.right:
    return 1 + minimumDepth(curr.left)
  
 
  return 1 + min(minimumDepth(curr.left), minimumDepth(curr.right))

class Solution:
    def minDepth(self, root: TreeNode) -> int:
        return minimumDepth(root)
