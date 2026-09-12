class Solution {
    public static ArrayList<Integer> findClosestPair(int arr1[], int arr2[], int x) {
        int i = 0;
        int j = arr2.length - 1;
        int minDiff = Integer.MAX_VALUE;
        int a = -1, b = -1;
        while (i < arr1.length && j >= 0) {
            int sum = arr1[i] + arr2[j];
            int diff = Math.abs(x - sum);
            if (diff < minDiff) {
                minDiff = diff;
                a = arr1[i];
                b = arr2[j];
            }
            if (sum > x) {
                j--;
            } else {
                i++;
            }
        }
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(a);
        ans.add(b);

        return ans;
    }
}