class Solution {
    // public int longestOnes(int[] nums, int k) {
    //     int max_l = 0;
    //     int no_zero = 0;
    //     int l=0, n=nums.length;

    //     for(int r=0;r<n;r++) {
    //         if(nums[r]==0)
    //             no_zero++;
    //         while(no_zero>k) {
    //             if(nums[l]==0)
    //                 no_zero--;
    //             l++;
    //         }

    //         max_l=Math.max(r-l+1,max_l);
    //     }

    //     return max_l;
    // }

    // public int longestOnes(int[] nums, int k) {
    //     int l=0;
    //     int len = 0;
    //     int c = 0;
    //     for(int r=0;r<nums.length;r++){
    //         if(nums[r]==0)
    //             c++;
    //         while(c>k){
    //             if(nums[l]==0)
    //                 c--;
    //             l++;
    //         }
    //         len = Math.max(r-l+1,len);
    //     }
    //     return len;
    // }

    // public int longestOnes(int[] nums, int k) {
    //     int maxLen = 0;
    //     int l = 0;
    //     int count = 0;
    //     for (int r = 0; r < nums.length; r++) {
    //         if (nums[r] == 0)
    //             count++;
    //         while (count > k) {
    //             if (nums[l] == 0)
    //                 count--;
    //             l++;
    //         }
    //         maxLen = Math.max(r - l + 1, maxLen);
    //     }
    //     return maxLen;
    // }

    public int longestOnes(int[] nums, int k) {

        int count = 0;
        int maxcount = Integer.MIN_VALUE;
        int b = k;
        int l = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                count++;
                b--;
            } else {
                count++;
            }
            while (b < 0) {
                if (nums[l] == 0) {
                    b++;
                }
                count--;
                l++;

            }

            maxcount = Math.max(maxcount, count);

        }

        return maxcount;
    }
}