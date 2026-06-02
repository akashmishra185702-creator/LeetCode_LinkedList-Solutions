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
    public void reorderList(ListNode head) {
        if(head == null || head.next == null) return ;
        ListNode slow = head;
        ListNode fast = head;
        while( fast.next!= null && fast.next.next != null)
        {
            fast = fast.next.next;
            slow = slow.next;
            
        }
        ListNode nextHalf = slow.next;
        slow.next = null;
        ListNode nextHalfRev = reverse(nextHalf);
        ListNode answer = new ListNode(23);
        ListNode temp = answer;
        slow = head;
        while(nextHalfRev != null){
        temp.next = slow;
        slow = slow.next;
        temp = temp.next;

        temp.next = nextHalfRev;
        temp = temp.next;
        nextHalfRev = nextHalfRev.next;
        }
        if(slow != null)
        temp.next = slow;
    }

    public ListNode reverse(ListNode head){
        ListNode prevNode = null;
        ListNode currentNode = head;
        while(currentNode != null)
        {
            ListNode nextNode = currentNode.next;
            currentNode.next = prevNode;

            prevNode = currentNode;
            currentNode = nextNode;
        }
        return prevNode;
    }
}