class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> res = new ArrayList<>();
        for(int e:nums1){
            map.put(e, map.getOrDefault(e,0)+1);
        }
        for(int e:nums2){
           if(map.containsKey(e) && map.get(e)>0){
            res.add(e);
            map.put(e, map.get(e)-1);
           }
        }
        return res.stream().mapToInt(i->i).toArray();
    }
}