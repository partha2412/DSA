class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int incr=1;
        int decr=1;
        int max = 1;
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]<nums[i]){
                incr++;
                decr=1;
            }
            else if(nums[i-1]>nums[i]){
                decr++;
                incr=1;
            }
            else{
                incr=1;
                decr=1;
            }
            max = Math.max(max, Math.max(incr, decr));
        }
        return max;
    }
}