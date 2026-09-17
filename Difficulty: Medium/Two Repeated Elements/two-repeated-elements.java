class Solution {
    public int[] twoRepeated(int[] arr) {
        int n = arr.length - 2;
        boolean[] seen = new boolean[n + 1];
        int[] result = new int[2];
        int idx = 0;

        for (int i = 0; i < arr.length; i++) {
            if (seen[arr[i]]) {
                result[idx++] = arr[i];
                if (idx == 2) break;
            } else {
                seen[arr[i]] = true;
            }
        }

        return result;
    }
}