class Solution {
    public int[] nextGreaterElement(int[] arr, int[] num) {
        int top;
        for(int i=0; i<arr.length; i++){
            top=0;
            while(!(num[top]==arr[i])) top++;
            while(top<num.length && num[top]<=arr[i]) top++;
            if(top==num.length) arr[i]=-1;
            else arr[i] = num[top];
        }
        return arr;
    }
}