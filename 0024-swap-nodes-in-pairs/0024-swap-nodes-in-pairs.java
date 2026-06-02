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
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null)
        {
            return head;
        }
        ListNode temp = head.next;
        if(head.next.next == null)
        {
            temp.next = head;
            head.next = null;
            return temp;
        }
        ListNode dummy = new ListNode(2);
        dummy.next = head;
        ListNode a = head; 
        ListNode b = head.next;
        ListNode c = dummy; 
        while(c.next!=null && c.next.next!= null)
        {
            a.next = b.next;
            b.next = c.next;
            c.next = b;

            c = a;
            a = a.next;
            if(a==null) break;
            b = a.next;
        }
        return dummy.next;
    }
}