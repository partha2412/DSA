class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for(int e:nums){
            int f = Math.abs(e);
            if(nums[f-1]<0)
                list.add(f);
            else
                nums[f-1]=-nums[f-1];
        }
        return list;
    }
}