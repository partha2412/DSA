class Solution {
    // public int majorityElement(int[] nums) {
    //     // HashMap<Integer,Integer> map = new HashMap<>();
    //     // for(int i=0;i<nums.length;i++){
    //     //     if(!map.containsKey(nums[i]))
    //     //         map.put(nums[i],1);
    //     //     else
    //     //         map.put(nums[i],map.get(nums[i])+1);
    //     // }
    //     // int max = Integer.MIN_VALUE;
    //     // for(int val:map.values()){
    //     //     max=Math.max(max,val);
    //     // }
    //     // return max;

    //     HashMap<Integer,Integer> map = new HashMap<>();
    //     for( int num:nums){
    //         map.put(num,map.getOrDefault(num,0)+1);
    //     }
    //     int maxfreq = Integer.MIN_VALUE;
    //     int key=0;
    //     for(Map.Entry<Integer, Integer> entry : map.entrySet()){
    //         if(entry.getValue()>maxfreq){
    //             maxfreq=entry.getValue();
    //             key=entry.getKey();
    //         }
    //     }
    //     return key;
    // }

    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int e:nums){
            map.put(e, map.getOrDefault(e, 0)+1);
        }
        int maxKey = map.entrySet()
                           .stream()
                           .max(Map.Entry.comparingByValue())
                           .map(Map.Entry::getKey)
                           .orElse(null);
        return maxKey;
    }
}