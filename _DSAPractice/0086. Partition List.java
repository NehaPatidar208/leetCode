/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode partition(ListNode head, int x) {
        if (head == null || head.next == null)return head;
        ListNode pre = null, cur = head;
        while(cur!=null && cur.val < x){
            pre=cur;
            cur=cur.next;
        }
        ListNode next , temp,curNext;
        while(cur!=null && cur.next!=null){
            if(cur.next.val<x){
                if(pre == null){
                    curNext = cur.next.next;
                    pre = cur.next;
                    pre.next = head;
                    head = pre;
                    cur.next = curNext;
                    
                }else{
                    next = pre.next;
                    curNext = cur.next.next;
                    pre.next = cur.next;
                    pre=pre.next; 
                    pre.next = next;
                    cur.next = curNext;
                }
            }
            else{
                cur=cur.next;
            }
        }
        return head;
    }
}
