# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def rotateRight(self, head: ListNode, k: int) -> ListNode:
        if head ==None or head.next==None:
            return head
        fast=slow=cur=head
        c=0
        while cur!=None:
            cur=cur.next
            c+=1
        k=k%c
        while  k:
            k-=1
            fast=fast.next;
        while fast.next !=None:
            slow=slow.next
            fast=fast.next
        fast.next=head
        head=slow.next
        slow.next=None
        return head
        