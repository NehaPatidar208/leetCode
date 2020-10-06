# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def insertIntoBST(self, root: TreeNode, val: int) -> TreeNode:
        cur=root
        if root== None:
            return TreeNode(val)
        while cur!=None:
            if val>cur.val:
                if cur.right is None:
                    cur.right=TreeNode(val)
                    break
                cur=cur.right
            elif val<cur.val:
                if cur.left is None:
                    cur.left=TreeNode(val)
                    break
                cur=cur.left
        return root
  