# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution(object):
    def getIntersectionNode(self, headA, headB):
        l1=0
        l2=0
        cur1=headA
        cur2=headB
        while cur1 is not None:
            cur1=cur1.next
            l1+=1
        while cur2 is not None:
            cur2=cur2.next
            l2+=1
        while l1>l2:
            l1-=1
            headA=headA.next
        while l2>l1:
            l2-=1
            headB=headB.next
        while headA !=None:
            if headA==headB:
                return headA
            headA=headA.next
            headB=headB.next
        return None  
            
        """
        :type head1, head1: ListNode
        :rtype: ListNode
        """
        
