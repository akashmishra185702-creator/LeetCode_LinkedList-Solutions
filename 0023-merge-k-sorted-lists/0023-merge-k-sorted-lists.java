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
    public ListNode mergeKLists(ListNode[] lists) {
        int size = lists.length;
        if(size == 0)
        return null;
        
        if( size == 1)
        {
            return lists[0];
        }
        ListNode first = lists[0];
        ListNode second = lists[1]; 

        ListNode answer = mergeSort(first,second);
        for(int i = 2; i< size;i++)
        {
            answer = mergeSort(answer,lists[i]);
        }
        return answer;
    }
    public ListNode mergeSort(ListNode a, ListNode b)
    {
        ListNode sorted = new ListNode(3);
        ListNode temp = sorted;
        ListNode tempA = a;
        ListNode tempB = b;
        while(tempA != null && tempB != null)
        {
            if(tempA.val>=tempB.val)
            {
                temp.next = tempB;
                tempB = tempB.next;
            }
            else 
            {
                temp.next = tempA;
                tempA = tempA.next;
            }
                temp = temp.next;
        }
        if(tempA == null)
        {
            temp.next = tempB;
        }
        else
        {
            temp.next = tempA;
        }
        return sorted.next;
    }
}