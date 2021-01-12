# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def addTwoNumbers(self, l1: ListNode, l2: ListNode) -> ListNode:
        head=tail=None
        tmp=0
        head=tail=l1
        c=(l1.val+l2.val)
        head.val=tail.val=c%10
        tmp=c//10
        l1=l1.next
        l2=l2.next
        while l1 is not None and l2 is not None:
            c=(l1.val+l2.val+tmp)
            tail.next.val=c%10
            tmp=c//10
            l1=l1.next
            l2=l2.next
            tail=tail.next
        if l1 is not None:
            tail.next=l1
            #tail=tail.next
        elif l2 is not None:
            tail.next=l2
            #tail=tail.next
        while  head!=tail  and tail.next !=None:
            tail=tail.next
            c=tail.val+tmp 
            tail.val=c%10
            tmp=c//10
            
        if tmp>0 :
            tail.next=ListNode(tmp)

        return head
