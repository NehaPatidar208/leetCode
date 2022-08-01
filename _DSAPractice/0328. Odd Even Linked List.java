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
    public ListNode oddEvenList(ListNode head) {
        if(head == null || head.next == null || head.next.next==null)return head;
        ListNode headOdd = head, headEven = head.next, odd = head, even = head.next;
        while(odd.next != null && odd.next.next !=null){
            odd.next = even.next;
            odd=odd.next;
            even.next = odd.next;
            even = even.next;
        }
        odd.next = headEven;
        return headOdd;
    }
}
