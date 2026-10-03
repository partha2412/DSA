class Solution {
    
    // public int threeSumClosest(int[] nums, int target){
    //     int closestSum = nums[0] + nums[1] + nums[2];

    //     for (int i = 0; i < nums.length - 2; i++) {
    //         for (int j = i + 1; j < nums.length - 1; j++) {
    //             for (int k = j + 1; k < nums.length; k++) {

    //                 int sum = nums[i] + nums[j] + nums[k];

    //                 // check if this sum is closer
    //                 if (Math.abs(sum - target) < Math.abs(closestSum - target)) {
    //                     closestSum = sum;
    //                 }
    //             }
    //         }
    //     }

    //     return closestSum;
    // }

    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int n = nums.length;
        int closestSum = nums[0] + nums[1] + nums[2];
        for (int i = 0; i < n - 2; i++) {
            int left = i + 1;
            int right = n - 1;
            while (left < right) {
             int currSum = nums[i] + nums[left] + nums[right];
                if (Math.abs(currSum - target) < Math.abs(closestSum - target)) {
                    closestSum = currSum;
                }
                if (currSum == target) {
                    return currSum;
                }
                else if (currSum < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return closestSum;
    }

        
    
    // public int threeSumClosest(int[] nums, int target) {
    //     Arrays.sort(nums);
    //     int sum = nums[0] + nums[1] + nums[2];
    //     for (int i=0; i<nums.length; i++) {
    //         int l=i+1,r=nums.length-1;
    //         while (l <= r) {
    //             int currSum = nums[i] + nums[l] + nums[r];
    //             if (currSum == target)
    //                 return currSum;
    //             else if (Math.abs(currSum-target) > Math.abs(sum-target)) {
    //                 sum = currSum;
    //             } else
    //                 l++;
    //         }
    //     }
    //     return sum;

    // }
}