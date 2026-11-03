class Solution {
    // public void moveZeroes(int[] nums) {
    //     // int l=0;
    //     // for(int r=0;r<nums.length;r++){
    //     //     if(nums[r]!=0){
    //     //         int temp = nums[r];
    //     //         nums[r] = nums[l];
    //     //         nums[l]=temp;
    //     //         l++;
    //     //     }
    //     // }
    //     int j=0;
    //     for(int i=0;i<nums.length;i++){
    //         if(nums[i]!=0){
    //             int temp = nums[i];
    //             nums[i] = nums[j];
    //             nums[j] = temp;
    //             j++;
    //         }
    //     }
    // }
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int l = 0;
        for(int r=0;r<n;r++){
            if(nums[r]!=0){
                if(l!=r){
                    nums[l]=nums[r];
                    nums[r] = 0;
                }
                l++;
            }
        }
    }
}