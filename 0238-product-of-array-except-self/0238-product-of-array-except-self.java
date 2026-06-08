class Solution {
    public int[] productExceptSelf(int[] arr){
        int n = arr.length;
        int[] ans = new int[n];
        Arrays.fill(ans,1);
        int pre=1;
        for(int i=0; i<arr.length; i++){
            ans[i] = ans[i] * pre;
            pre = pre * arr[i];
        }
        int post=1;
        for(int i=n-1; i>-1; i--){
            ans[i] = ans[i] * post;
            post = post * arr[i];
        }
        return ans;
    }
}