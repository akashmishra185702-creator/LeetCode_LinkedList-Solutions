class Solution {
    public int[] nextGreaterElements(int[] arr) {
        Stack<Integer> st = new Stack<>();
        int n=arr.length;
        st.push(arr[n-1]);
        int[] ans = new int[n];
        for(int i=n-2; i>-1; i--){
            while(st.size()>0 && st.peek()<=arr[i]) st.pop();
            if(st.size()>0) ans[i]=st.peek();
            st.push(arr[i]);
        }
        for(int i=n-1; i>-1; i--){
            while(st.size()>0 && st.peek()<=arr[i]) st.pop();
            if(st.size()==0) ans[i]=-1;
            else ans[i]=st.peek();
            st.push(arr[i]);
        }
        return ans;
    }
}