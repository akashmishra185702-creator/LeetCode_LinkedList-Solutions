/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int Asize = getSize(headA);
        int Bsize = getSize(headB);
        if(Asize >= Bsize)
        {
            for(int i=1; i<= Asize-Bsize; i++)
            {
                headA = headA.next;
            }
        }
        else
        {
            for(int i=1; i<= -Asize+Bsize; i++)
            {
                headB = headB.next;
            }
        }
        while(headA != null)
        {
            if(headA == headB)
            return headA;
            headA = headA.next;
            headB = headB.next;
        }
        return headA;
        // ListNode headArev = helper(headA);
        // ListNode headBrev = helper(headB);
        // while(headArev!= null)
        // {
        //     if(headArev.val != headBrev.val)
        //     {
        //         return headArev;
        //     }
        //     headArev = headArev.next;
        //     headBrev = headBrev.next;
        // }
        // return headA;
    }
    public static int getSize(ListNode temp)
    {
        int size = 0;
        while(temp != null )
        {
            temp = temp.next;
            size++;
        }
        return size;
    }
}
//     public static ListNode helper(ListNode head)
//     {
//         ListNode prevNode = head;
//         ListNode currNode = head.next;
//         while(currNode != null)
//         {
//             ListNode nextNode = currNode.next;
//             currNode.next = prevNode;

//             prevNode = currNode;
//             currNode = nextNode;
//         }
//         head.next = null;
//         return prevNode;
//     }
// 