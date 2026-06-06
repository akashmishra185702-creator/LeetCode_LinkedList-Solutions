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
    public ListNode removeNodes(ListNode head) {
        ListNode headR = reverse(head);
        ListNode temp = headR;
        int max = temp.val;
        while(temp.next!=null){
            if(max>temp.next.val){
                temp.next = temp.next.next;
            }
            else {
                max = temp.next.val;
                temp = temp.next;
            }
        }
        return reverse(headR);
        
    }
    public ListNode reverse(ListNode head){
        ListNode currNode = head;
        ListNode prevNode = null;
        while(currNode!=null){
            ListNode nextNode = currNode.next;
            currNode.next = prevNode;

            prevNode = currNode;
            currNode = nextNode;
        }
        return prevNode;
    }
}