class Solution {
    public int countZeroes(int[] arr) {
        // code here
        int low = 0;
        int high = arr.length - 1;
        while(low <= high){
            int mid = low + (high-low)/2;
            if(arr[mid] == 0){
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return arr.length-low;
    }
};