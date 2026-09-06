class Solution {
    static long kthDigit(int a, int b, int k) {
        long num = 1;
        for (int i = 1; i <= b; i++) {
            num *= a;
        }
        for (int i = 1; i < k; i++) {
            num /= 10;
        }

        return num % 10;
    }
}