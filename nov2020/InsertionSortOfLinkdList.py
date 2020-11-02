# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

def fun(root,tmp):
    if tmp.val <root.val:
        tmp.next=root
        return tmp
    cur=root
    while root.next.val <tmp.val:
        root=root.next
    tmp.next=root.next
    root.next=tmp
    return cur
    
    
class Solution:
    def insertionSortList(self, head: ListNode) -> ListNode:
        tmp=head
        if head is None or head.next is None:
            return head
        while tmp.next !=None:
            if tmp.val> tmp.next.val:
                g=tmp.next.next
                head=fun(head,tmp.next)
                tmp.next=g
            else:
                tmp=tmp.next
        return head
