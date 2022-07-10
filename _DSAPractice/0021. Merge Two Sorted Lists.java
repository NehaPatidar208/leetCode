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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode tmp=new ListNode(0);
        ListNode res= tmp;
        while (list1!= null && list2!= null){
            if (list1.val < list2.val){
                tmp.next = list1;
                tmp = tmp.next;
                list1=list1.next;
                }
            else{
                tmp.next = list2;
                tmp= tmp.next;
                list2=list2.next;
                }
            }
        if (list1 != null)
            tmp.next = list1;
        if (list2 != null)
            tmp.next = list2;
        return res.next;
    }
}
