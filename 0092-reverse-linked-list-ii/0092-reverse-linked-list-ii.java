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
    public ListNode reverseBetween(ListNode head, int l, int r) {
        if(head == null || head.next == null) return head;
        ListNode right = head;
        ListNode dummy = new ListNode(2);
        dummy.next = head;
        ListNode left = dummy;
        
        while(l>1){
            left = left.next;
            l--;
        }
        while(r>1){
            right = right.next;
            r--;
        }
        ListNode store = right.next;
        right.next = null;
        ListNode revSub = reverse(left.next);
        left.next = revSub;
        ListNode temp = revSub;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = store;
        return dummy.next;
    }
    public ListNode reverse(ListNode head)
    {

        ListNode prevNode = null;
        ListNode currNode = head;
        while(currNode != null){
            ListNode nextNode = currNode.next;
            currNode.next = prevNode;

            prevNode = currNode;
            currNode = nextNode;
        }
        return prevNode;
    }
}