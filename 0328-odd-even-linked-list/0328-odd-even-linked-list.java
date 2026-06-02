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
    public ListNode oddEvenList(ListNode head) {
        ListNode dummy =  new ListNode(0);
        ListNode dummy2 =  new ListNode(0);
        ListNode temp =  dummy;
        ListNode temp2 =  dummy2; int i =1;
        while(head!= null){
            if(i % 2 == 0){
                temp2.next = head;
                temp2 = head;
            }
            else{
                temp.next = head;
                temp = head;
            }
            head = head.next;
            i++;
        }
        temp2.next = null;
        temp.next = dummy2.next;
        return dummy.next;
    }
}