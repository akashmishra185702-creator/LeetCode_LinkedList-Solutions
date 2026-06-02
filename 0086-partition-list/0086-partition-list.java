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
        if(head == null || head.next == null)
        {
            return head;
        }
        ListNode dummy =  new ListNode(0);
        ListNode dummy2 =  new ListNode(0);
        ListNode temp =  dummy;
        ListNode temp2 =  dummy2;
        while(head!= null){
            if(head.val >= x){
                temp2.next = head;
                temp2 = head;
            }
            else{
                temp.next = head;
                temp = head;
            }
            head = head.next;
        }
        temp2.next = null;
        temp.next = dummy2.next;
        return dummy.next;
    }
}