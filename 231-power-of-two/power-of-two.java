class Solution {
    public boolean isPowerOfTwo(int n) {
        // boolean positive = n > 0;

        return ((n & (n-1)) == 0) && n>0;

    }
}