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
    ListNode reverse(ListNode cur){
        ListNode pre = null;
        while(cur != null){
            ListNode temp = cur.next;
            cur.next=pre;
            pre=cur;
            cur=temp;
        }
        return pre;
    }
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null)return true;
        ListNode first = head, second = head.next;
        while(second != null && second.next !=null){
            first = first.next;
            second = second.next.next;
        }
        first.next = reverse(first.next);
        first=first.next;
        
        while(first!=null){
            System.out.println(head.val + " " + first.val);
            if(head.val != first.val)return false;
            first = first.next;
            head= head.next;
        }
        return true;
    }
}
