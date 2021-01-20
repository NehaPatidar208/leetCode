# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution(object):
    def hasCycle(self, head):
        f=s=head
        t=0
        while  s !=None and s.next !=None and s.next.next !=None:
            
            f=f.next
            s=s.next.next
            if (f==s):
                return True
        return False
        """
        :type head: ListNode
        :rtype: bool
        """
        
