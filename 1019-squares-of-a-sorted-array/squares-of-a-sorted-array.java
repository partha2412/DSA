import java.util.Arrays;

class Solution {
    public int[] sortedSquares(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            nums[i] = (int) Math.pow(nums[i], 2);
        }

        int r = nums.length - 1;
        int[] res = new int[nums.length];
        int i =0, l = 0;
        while (l <= r) {
            if (nums[r] > nums[l]) {
                res[i++] = nums[r--];
            } else {
                res[i++] = nums[l++];
            }

        }

        Arrays.sort(res);
        return res;
    }
}