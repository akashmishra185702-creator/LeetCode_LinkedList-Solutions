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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(17);
        ListNode temp = dummy;
        ListNode tempA = l1;
        ListNode tempB = l2;
        int carey = 0;
        while(tempA!=null || tempB!=null || carey!=0){
            int sum = carey;
            if(tempA!=null){
                sum += tempA.val;
                tempA = tempA.next;
            }
            if(tempB!=null){
                sum += tempB.val;
                tempB = tempB.next;
            }
            carey = sum/10;
            ListNode curr = new ListNode(sum%10);
            temp.next = curr;
            temp = temp.next;
        }
        return dummy.next;
    }
}