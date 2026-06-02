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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode fast = head;
        ListNode slow = head;
        ListNode back = head;
        for(int i=1; i<k; i++){
            back = back.next;
            fast = fast.next;
        }
        while(fast.next!=null)
        {
            fast = fast.next;
            slow = slow.next;
        }
        int temp = back.val;
        back.val = slow.val;
        slow.val = temp;
        return head;
    }
}