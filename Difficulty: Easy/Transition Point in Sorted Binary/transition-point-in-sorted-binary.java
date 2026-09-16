class Solution {
    int transitionPoint(int arr[]) {
        // code here
        int n = arr.length;
        if(arr[0] == 1) return 0;
       // if(arr[0] == 0 && arr[n-1] == 0) return -1;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 1) return i;
        }
        return -1;
    }
}