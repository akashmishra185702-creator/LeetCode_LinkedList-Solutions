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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode a = list1;
        ListNode b = list2;
        ListNode fake = new ListNode(17);
        ListNode dummy = fake;
        while(a!=null && b!= null)
        {
        if(a.val>=b.val){
            dummy.next = b;
            b = b.next;
        }
        else{
            dummy.next = a;
            a = a.next;
        }
        dummy = dummy.next;
    }
        if(a != null)
        {
            dummy.next = a;
        }
        else{
        dummy.next = b;
        }
    return fake.next;
}}