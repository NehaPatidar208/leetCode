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
    ListNode midNode(ListNode head){
        ListNode slow=null;
        while(head!=null && head.next!=null){
            slow = (slow!=null)?slow.next:head;
            head=head.next.next;
        }
        ListNode mid = slow.next;
        slow.next = null;
        return mid;
    }
    ListNode merge(ListNode head1, ListNode head2){
        ListNode head = new ListNode(-1);
        ListNode cur = head;
        while(head1!=null && head2!=null){
            if(head1.val < head2.val){
                cur.next = head1;
                head1=head1.next;
                cur=cur.next;
            }else{
                cur.next = head2;
                head2=head2.next;
                cur=cur.next;
            }
        }
        cur.next = (head1!=null) ? head1 : head2;
        return head.next;
    }
    public ListNode sortList(ListNode head) {
        if(head==null || head.next ==null)return head;
        ListNode mid = midNode(head);
        ListNode left = sortList(head);
        ListNode right = sortList(mid);
        return merge(left,right);
    }
}
