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
        ListNode a = head;
        ListNode b = head;
        while(b!= null)
        {
            while(b!= null&&a.val == b.val)
            {
                b = b.next;
                
            }
            a.next = b;
            a=b;
        }
        return head;
    //   ListNode temp = head;
    // if(temp == null || temp.next == null)
    // {
    //     return head;
    // }
    //     while(temp!=null && temp.next != null )
    //     {
    //         while(temp.next != null &&temp.val == temp.next.val)
    //         {
    //             temp.next = temp.next.next;
    //         }
    //         temp = temp.next;
    //     }
    //     return head;
    }
}