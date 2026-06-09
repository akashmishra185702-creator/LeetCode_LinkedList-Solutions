class Solution {
    public int[] dailyTemperatures(int[] arr) {
        Stack<Integer> st = new Stack<>();
        int n = arr.length;
        int[] ans = new int[n];
        ans[n-1] = 0;
        st.push(n-1);
        for(int i=n-2; i>-1; i--){
            while(st.size()>0 && arr[st.peek()]<=arr[i]) st.pop();
            if(st.size()==0){
                ans[i]=0;
            }
            else{
                ans[i] = st.peek()-i;
            }
            st.push(i);
        }
        return ans;
    }
}