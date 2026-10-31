class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        if(n<=1) return;
        k = k % n;
        int t;
        int i=0;
        int j=n-1;
        while(i<j){
            t = nums[i];
            nums[i] = nums[j];
            nums[j] = t;
            i++;
            j--;
        }
        i=0;
        j=k-1;
        while(i<j){
            t = nums[i];
            nums[i] = nums[j];
            nums[j] = t;
            i++;
            j--;
        }
        i=k;
        j=n-1;
        while(i<j){
            t = nums[i];
            nums[i] = nums[j];
            nums[j] = t;
            i++;
            j--;
        }
    }
}