/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if(head == null) return head;
        Node ans = new Node(17);
        Node answer = ans;
        Node temp = head;
        while(temp != null){
            answer.next =  new Node(temp.val);
            answer = answer.next;
            temp = temp.next;
        }
        temp = head;
        answer = ans.next;
    
        while(temp!=null){
            Node store = temp.next;
            Node store2 = answer.next;

            temp.next = answer;
            answer.next = store;

            temp = store;
            answer = store2;
            
        }
        temp = head;
        answer = ans;
        while(temp != null){
            if (temp.random != null) { 
                temp.next.random = temp.random.next; 
            }
            temp = temp.next.next;
        }
        answer = ans;
        temp = head;
        while(temp != null){ 
            answer.next = temp.next;
            answer = answer.next;
            
            temp.next = temp.next.next;
            temp = temp.next;
        }
        return ans.next;
    }
}