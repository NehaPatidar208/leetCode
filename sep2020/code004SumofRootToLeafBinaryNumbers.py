# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
def helper(root,stck,s):
    if root is None:
        return s
    stck.append(root.val)
    s=helper(root.left,stck,s)
    s=helper(root.right,stck,s)
    if root.left is None and root .right is None: 
        s.append(stck.copy())
    if len(stck)>1:   
        stck.pop()
    return s

class Solution:
    def sumRootToLeaf(self, root: TreeNode) -> int:
        if root is None:
            return 0
        s=[]
        d=[]
        res=helper(root,s,d)
        tmp=0
        for i in res:
            
            c=0
            for j in range(len(i)):
                c+=i[j]*(2**(len(i)-j-1))
            #print("i=",i," c=",c)
            tmp+=c
        return tmp
