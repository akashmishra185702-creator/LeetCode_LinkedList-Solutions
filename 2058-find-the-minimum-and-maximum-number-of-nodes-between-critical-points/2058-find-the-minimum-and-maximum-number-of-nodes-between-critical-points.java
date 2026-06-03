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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int[] array = {-1,-1};
        ListNode prev = head;
        ListNode curr = head.next;
        ListNode nect = head.next.next;
        if(nect == null)
        return array;
        int firstIdx = -1;
        int lastIdx = -1;
        int index = 2;
        int minimum = Integer.MAX_VALUE;
        while(curr.next != null){
            if((curr.val > nect.val && curr.val > prev.val) || (curr.val < nect.val && curr.val < prev.val)){
                if(firstIdx == -1) firstIdx = index;
                if(lastIdx != -1){  
                int diff = index - lastIdx;
                if(minimum > diff) minimum = diff;
                }
                lastIdx = index;
            }
                index ++;
            curr = curr.next;
            prev = prev.next;
            nect = nect.next; 
        }
        int max = -firstIdx + lastIdx;
        if(max == 0)
        {
            return array;
        }
        // if(min == Integet.MAX_VALUE)
        // {
        //     array[1] = max;
        //     return array;
        // }
        array[0] = minimum;
        array[1] = max;
        return array;
    }
}