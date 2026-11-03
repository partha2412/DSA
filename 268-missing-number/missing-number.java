class Solution {
    // public int missingNumber(int[] nums) {
    //     int v[] = new int[nums.length+1];
    //     Arrays.fill(v,-1);
    //     for(int i=0;i<nums.length;i++){
    //         v[nums[i]] = nums[i];
    //     }
    //     for(int i=0;i<v.length;i++){
    //         if(v[i]==-1)
    //             return i;
    //     }
    //     return 0;
    // }

    public int missingNumber(int[] nums) {
        int[] helper = new int[nums.length+1];
        for(int n:nums){
            helper[n] = 1;
        }
        int ans=-1;
        for(int i=0; i<helper.length; i++){
            if(helper[i]==0)
                ans = i;
        }
        return ans;
    }
}