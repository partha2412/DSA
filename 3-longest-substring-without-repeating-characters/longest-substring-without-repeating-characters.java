class Solution {
    public int lengthOfLongestSubstring(String s) {
        // Set<Character> set = new HashSet<>();
        // int left = 0;
        // int max = 0;

        // for (int right = 0; right < s.length(); right++) {
        //     while (set.contains(s.charAt(right))) {
        //         set.remove(s.charAt(left));
        //         left++;
        //     }
        //     set.add(s.charAt(right));
        //     max = Math.max(max, right - left + 1);
        // }
        // return max;


        // using index map
        // Map<Character, Integer> map = new HashMap<>();
        // int max = 0;
        // int left = 0;

        // for (int right = 0; right < s.length(); right++) {
        //     char ch = s.charAt(right);
        //     if (map.containsKey(ch)) {
        //         left = Math.max(left, map.get(ch) + 1);
        //     }
        //     map.put(ch, right);
        //     max = Math.max(max, right - left + 1);
        // }
        // return max;


        //using general for-while loop
        // Set<Character> set = new HashSet<>();
        // int l = 0;
        // int size = 0;
        // for(int r=0;r<s.length();r++){
        //     Character c = s.charAt(r);
        //     if(set.contains(c)){
        //         set.remove(s.charAt(l));
        //         l++;
        //     }
        //     set.add(c);
        //     size = Math.max(size,r-l+1);
        // }
        // return size;



        // using index map
        Map <Character, Integer> map = new HashMap<>();
        int tot = 0;
        int l = 0;
        for(int r=0;r<s.length();r++){
            Character c = s.charAt(r);
            if(map.containsKey(c)){
                l = Math.max(l,map.get(c)+1);
            }
            map.put(c,r);
            tot = Math.max(tot,r-l+1);
        }
        return tot;
























        // for(int i=0;i<s.length();i++){
        //     Character c = s.charAt(i);
        //     while(){

        //     }
        // }
    }
}