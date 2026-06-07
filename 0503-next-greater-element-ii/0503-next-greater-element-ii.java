class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[n];
        int max = Integer.MIN_VALUE;
        Arrays.fill(ans,-1);
        for(int i=n-1; i>-1; i--){
            max = Math.max(max,nums[i]);
            if(st.isEmpty()) st.push(nums[i]);
            else if(st.peek()<=nums[i]){
                while(!st.isEmpty() && st.peek()<=nums[i]){
                    st.pop();
                }
                st.push(nums[i]);
            }
            else{
                ans[i] = st.peek();
                st.push(nums[i]);
            }
        }
        for(int i=n-1; i>=0; i--){
            while(!st.isEmpty() && st.peek() <= nums[i]){
                st.pop();
            }

            if(ans[i] == -1 && !st.isEmpty()){
                ans[i] = st.peek();
            }

            st.push(nums[i]);
        }
        return ans;
    }
}