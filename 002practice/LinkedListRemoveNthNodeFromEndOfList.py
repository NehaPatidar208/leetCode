# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def removeNthFromEnd(self, head, n):
        if head==None:
            return head
        f=s=head
        while n:
            n-=1
            f=f.next
        if f==None:
            return s.next
        while f.next !=None:
            f=f.next
            s=s.next
        s.next=s.next.next
        return head
        """
        :type head: ListNode
        :type n: int
        :rtype: ListNode
        """
        
