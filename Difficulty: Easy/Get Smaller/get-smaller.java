class Solution {
    public static ArrayList<Integer> getSmaller(int arr[], int target) {
        // your code 
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < target) ans.add(arr[i]);
        }
        return ans;
    }
}