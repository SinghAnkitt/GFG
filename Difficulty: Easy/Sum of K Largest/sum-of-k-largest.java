class Solution {
    public int getMaxVal(List<Integer> arr, int k) {
        // code here
        Collections.sort(arr);
        int sum = 0;
        for(int i = arr.size()-k; i < arr.size(); i++){
            sum += arr.get(i);
        }
        return sum;
    }
}