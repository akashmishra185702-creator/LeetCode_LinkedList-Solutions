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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null)
        {
            return head;
        }
        int size = 0;
        ListNode temp = head;
        while(temp != null)
        {
            size ++;
            temp = temp.next;
        }
        
        int n = k % size;
    
        if (n == 0) {
            return head; 
        }
        
        ListNode ans = head.next;
        ListNode tail = head;
        
        temp = head;
        
        for(int i=1; i<=n; i++)
        {
            temp = temp.next;
        }
        while(temp.next != null)
        {
            temp = temp.next;
            ans = ans.next;
            tail = tail.next;
        }
        temp.next = head;
        tail.next = null;
        
        return ans;
    }
}
