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
    public ListNode deleteMiddle(ListNode head) {
        if(head.next == null)
        {
            return null;
        }
        ListNode fast = head.next;
        ListNode slow = head;
        if(fast.next == null)
        {
            head.next = null;
            return head;
        }
        while(fast.next!=null && fast.next.next!=null)
        {
            fast = fast.next.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return head;
        // ListNode temp = head;
        // int index = 0;
        // while(temp!= null)
        // {
        //     index++;
        //     temp = temp.next;
        // }
        // if(index == 1) return null;
        // if(index == 2)
        // {
        //     head.next = null;
        //     return head;
        // }
        
        // temp = head;
        // for(int i=1; i<index/2; i++ )
        // {
        //     temp = temp.next;
        // }
        // temp.next = temp.next.next;
        // return head;
    }
}