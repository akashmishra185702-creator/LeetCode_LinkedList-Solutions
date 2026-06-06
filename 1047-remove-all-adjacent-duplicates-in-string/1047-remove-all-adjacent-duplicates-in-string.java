class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st = new Stack<>();
        st.push(s.charAt(0));
        for(int i=1; i<s.length(); i++){
            char ch = s.charAt(i);
            if(st.isEmpty()) st.push(ch);
            else if(st.peek()==ch) st.pop();
            else{
                st.push(ch);
            }
        }
        StringBuilder ans = new StringBuilder();
        while(!st.isEmpty()){
            ans.append(st.pop());
        }
        
        return ans.reverse().toString();
    }
}