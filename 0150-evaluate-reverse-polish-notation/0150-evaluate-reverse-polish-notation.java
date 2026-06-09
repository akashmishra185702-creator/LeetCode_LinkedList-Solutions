class Solution {
    public int evalRPN(String[] arr) {
        Stack<String> st = new Stack<>(); 
        int n = arr.length;
        for(int i=0; i<n; i++){
            String temp = arr[i];
            if(temp.equals("*")){
                int a = Integer.parseInt(st.pop());
                int b = Integer.parseInt(st.pop());
                st.push(String.valueOf(a * b)); 
            }
            else if(temp.equals("+")){
                int a = Integer.parseInt(st.pop());
                int b = Integer.parseInt(st.pop());
                st.push(String.valueOf(a + b)); 
            }
            else if(temp.equals("-")){
                int a = Integer.parseInt(st.pop());
                int b = Integer.parseInt(st.pop());
                st.push(String.valueOf(b - a)); 
            }
            else if(temp.equals("/")){
                int a = Integer.parseInt(st.pop());
                int b = Integer.parseInt(st.pop());
                st.push(String.valueOf(b / a)); 
            }
            else{
                st.push(temp);
            }
        }
        return Integer.parseInt(st.pop());
    }
}