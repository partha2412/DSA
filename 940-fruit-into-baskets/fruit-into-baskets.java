class Solution {
    // public int totalFruit(int[] fruits) {
    //     HashMap<Integer, Integer> map = new HashMap<>();
    //     int n = fruits.length;
    //     int maxl = 0, l=0;
    //     for(int r=0;r<n;r++) {
    //         map.put(fruits[r], map.getOrDefault(fruits[r],0) + 1);

    //         while(map.size()>2) {
    //             map.put(fruits[l], map.get(fruits[l]) - 1);

    //             if (map.get(fruits[l]) == 0) {
    //                 map.remove(fruits[l]);
    //             }
    //             l++;
    //         }
    //         maxl = Math.max(maxl, r-l+1);
    //     }
    //     return maxl;
    // }

    public int totalFruit(int[] fruit) {
        int max=0,l=0;
        Map<Integer,Integer> map = new HashMap<>();
        for(int r=0;r<fruit.length;r++){
            map.put(fruit[r], map.getOrDefault(fruit[r], 0)+1);
            while(map.size()>2){
                map.put(fruit[l],map.get(fruit[l])-1);
                if(map.get(fruit[l])==0){
                    map.remove(fruit[l]);
                }
                l++;
            }
            max = Math.max(max, r-l+1);
        }
        return max;
    }
}