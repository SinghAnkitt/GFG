class Solution {
    public int reverseDigits(int n) {
        // Code here
        int num = n;
        int rev = 0;
        while( n > 0){
            int temp = n % 10;
            rev = 10*rev + temp;
            n /= 10;
        }
        return rev;
    }
}