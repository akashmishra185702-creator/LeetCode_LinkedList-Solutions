class Solution {
    public int[] productExceptSelf(int[] arr) {
        int product = 1;
        int count = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==0){
                count ++;
                if(count == 2){
                Arrays.fill(arr,0);
                return arr;
                }
            }
            else{
                product = product*arr[i];
            }
        }
        if(count == 1){
            for(int i=0; i<arr.length; i++){
                if(arr[i]==0){
                    arr[i]=product;
                }
                else
                arr[i] = 0;
            }
            return arr;
        }  
        for(int i=0; i<arr.length; i++){
            arr[i] = product/arr[i];
        }
        return arr;
    }
}