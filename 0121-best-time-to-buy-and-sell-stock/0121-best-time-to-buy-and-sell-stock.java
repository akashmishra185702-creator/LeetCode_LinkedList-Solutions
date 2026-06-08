class Solution {
    public int maxProfit(int[] arr) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int diff =0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
            }
            if(arr[i]<min){
                min = arr[i];
                max = arr[i];
            }
            diff = Math.max(diff,max-min);
        }
        return diff;
    }
}