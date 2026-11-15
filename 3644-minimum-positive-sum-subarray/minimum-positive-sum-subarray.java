class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int n=nums.size();
        int ans = Integer.MAX_VALUE;
        for (int j = 0; j < n; j++) {
            int sum = 0;
            for (int i = j; i < n; i++) {
                sum += nums.get(i);
                int len = i - j + 1;
                if (len >= l && len <= r && sum > 0) {
                    ans = Math.min(ans, sum);
                }
            }
        }
        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}