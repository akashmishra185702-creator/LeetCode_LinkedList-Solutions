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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode(-1);
        ListNode temp = head;
        ListNode unique = dummy;
        while(temp != null)
        {
        boolean flag = true;
            while(temp.next != null && temp.val == temp.next.val)
            {
                temp = temp.next;
                flag = false;
            }
            if(flag)
            {
                unique.next = temp;
                unique = unique.next;
            }
            temp= temp.next;
        }
        unique.next = null;
        return dummy.next;
    }
}