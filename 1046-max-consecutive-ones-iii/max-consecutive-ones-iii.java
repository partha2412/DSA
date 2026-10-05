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











    public int longestOnes(int[] nums, int k){
        int maxLen = 0;
        int l = 0;
        int count = 0;
        for(int r=0;r<nums.length;r++) {
            if(nums[r]==0)
                count++;
            while(count>k) {
                if(nums[l]==0)
                    count--;
                l++;
            }
            maxLen=Math.max(r-l+1, maxLen);
        }
        return maxLen;
    }
}