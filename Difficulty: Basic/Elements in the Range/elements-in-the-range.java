class Solution {
    public boolean checkElements(int start, int end, int[] arr) {
        // code here
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == start){
                if(start == end) return true;
                start++;
                i = -1;
            }
        }
        return false;
    }
}