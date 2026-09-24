class Solution {
    public int[] countBits(int n) {
        int[] ans = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            // String s = Integer.toBinaryString(i);
            int num = i;
            int count = 0;
            while (num > 0) {
                int rem = num % 2;
                num = num / 2;
                if (rem == 1)
                    count++;
            }
            ans[i] = count;
        }
        return ans;
    }
}