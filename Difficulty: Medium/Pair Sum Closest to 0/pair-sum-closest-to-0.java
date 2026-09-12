class Solution {
    public static int closestToZero(int arr[]) {

        Arrays.sort(arr);

        int left = 0;
        int right = arr.length - 1;

        int min = Integer.MAX_VALUE;

        while (left < right) {

            int sum = arr[left] + arr[right];

            // Better sum
            if (Math.abs(sum) < Math.abs(min)) {
                min = sum;
            }

            // Tie: prefer positive sum
            else if (Math.abs(sum) == Math.abs(min)) {
                min = Math.max(min, sum);
            }

            if (sum < 0) {
                left++;
            } else {
                right--;
            }
        }

        return min;
    }
}