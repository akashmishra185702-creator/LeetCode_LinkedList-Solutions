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
    public int pairSum(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode otherHalfRev = reverse(slow.next);
        slow.next = null;
        int x = head.val+otherHalfRev.val;
        while(otherHalfRev!= null)
        {
            int b = head.val+otherHalfRev.val;
            x = Math.max(x,b);
            head = head.next;
            otherHalfRev = otherHalfRev.next;
        }
        return x;
    }
    public ListNode reverse(ListNode head){
        ListNode currentNode = head;
        ListNode prevNode = null;
        ListNode nextNode = null;
        while(currentNode != null)
        {
            nextNode = currentNode.next;
            currentNode.next = prevNode;

            prevNode = currentNode;
            currentNode = nextNode;
        }
        return prevNode;
    }
}