# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def mergeTwoLists(self, l1: ListNode, l2: ListNode) -> ListNode:
        if l1== None:
            return l2
        if l2==None:
            return l1
        head=tail=None
        if l1.val>l2.val:
            head=tail=l2
            l2=l2.next
        else:
            head=tail=l1
            l1=l1.next
        while l1 is not None and l2 is not None:
            if l1.val<l2.val:
                tail.next=l1
                l1=l1.next
                tail=tail.next
            else:
                tail.next=l2
                l2=l2.next
                tail=tail.next
        if l1 is not None:
            tail.next=l1
        if l2 is not None:
            tail.next=l2
        return head