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
        ListNode temp = head;
        Stack<Integer> st = new Stack();
        while(temp!=null){
            if(st.isEmpty()) st.push(temp.val);
            else if(st.peek()>temp.val){
                st.push(temp.val);
            }
            else {
                while(st.peek()<temp.val){
                    st.pop();
                    if(st.isEmpty()) break;
                }
                st.push(temp.val);
            }
            temp = temp.next;
        }
        ListNode answer = new ListNode(17);
        ListNode ans = answer;
        Stack<Integer> stack = new Stack<>();
         while(!st.isEmpty()){
            stack.push(st.pop());
        }
        while(!stack.isEmpty()){
            temp = new ListNode(stack.pop());
            ans.next = temp;
            ans = temp;
        }
        return answer.next;
    }
 }






// class Solution {
//     public ListNode removeNodes(ListNode head) {
//         ListNode headR = reverse(head);
//         ListNode temp = headR;
//         int max = temp.val;
//         while(temp.next!=null){
//             if(max>temp.next.val){
//                 temp.next = temp.next.next;
//             }
//             else {
//                 max = temp.next.val;
//                 temp = temp.next;
//             }
//         }
//         return reverse(headR);
        
//     }
//     public ListNode reverse(ListNode head){
//         ListNode currNode = head;
//         ListNode prevNode = null;
//         while(currNode!=null){
//             ListNode nextNode = currNode.next;
//             currNode.next = prevNode;

//             prevNode = currNode;
//             currNode = nextNode;
//         }
//         return prevNode;
//     }
// }