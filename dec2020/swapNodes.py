# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def swapPairs(self, head: ListNode) -> ListNode:
        if head is None or head .next is None:
            return head
        cur=head
        while (cur != None and cur.next != None):
            if cur.next != None:
                tmp=cur.val
                cur.val=cur.next.val
                cur.next.val=tmp
                cur=cur.next
            cur=cur.next
        return head
  
