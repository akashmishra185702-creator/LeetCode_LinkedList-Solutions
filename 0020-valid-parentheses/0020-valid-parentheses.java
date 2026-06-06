class Solution {
    public boolean isValid(String s) {
        int n = s.length();
        if(n%2 != 0){
            return false;
        }
        Stack<Character> st = new Stack<>();
        for(int i=0; i<n; i++){
            char ch = s.charAt(i);
            if( (ch =='(') || (ch =='[') ||(ch =='{')){
                st.push(ch);
            }
            else if(ch == ')'){
                if(st.isEmpty()) return false;
                if(st.peek() == '('){
                    st.pop();
                }
                else return false;
            }
            else if(ch == '}'){
                if(st.isEmpty()) return false;
                if(st.peek() == '{'){
                    st.pop();
                }
                else return false;
            }
            else{
                if(st.isEmpty()) return false;
                if(st.peek() == '['){
                    st.pop();
                }
                else return false;
            }
        }
        if(st.isEmpty())
        return true;
        return false;
    }
}

    