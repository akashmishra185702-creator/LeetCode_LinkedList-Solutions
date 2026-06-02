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
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next != null && fast.next.next!= null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode head2 = slow.next;
        slow.next = null;
        head = sortList(head);
        head2 = sortList(head2);
        return mergeSort(head, head2);
    }
    public ListNode mergeSort(ListNode a, ListNode b)
    {
        ListNode dummy = new ListNode(17);
        ListNode temp = dummy;
        while(a!= null && b!=null)
        {
            if(a.val>= b.val){
                temp.next = b;
                b = b.next;
            }
            else{
                temp.next = a;
                a = a.next;
            }
            temp = temp.next;
        }
        if(a == null){
            temp.next = b;
        }
        else{
            temp.next = a;
        }
        return dummy.next;
    }
}