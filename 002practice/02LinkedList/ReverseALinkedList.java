/**
 * Definition for singly-linked list.
 * public class Node {
 *     int val;
 *     Node next;
 *     Node() {}
 *     Node(int val) { this.val = val; }
 *     Node(int val, Node next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public Node reverseList(Node head) {
        if(head==null || head.next ==null){
            return head;
        }
        Node prev=null;
        while(head!=null){
            Node next=head.next;
            head.next=prev;
            prev=head;
            head=next;
        }
        return prev;
        
    }
}
