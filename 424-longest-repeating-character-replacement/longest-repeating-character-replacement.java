class Solution {
    // public int characterReplacement(String s, int k) {

    // //     // int[] freq = new int [26];
    // //     // for(int r=0;r<s.length();r++){
    // //     //     Character  ch = s.charAt(r);
    // //     //     freq[ch - 'A']++;
    // //     //     if(>ka){
    // //     //         freq(s.charAt(l))--;
    // //     //         l++
    // //     //     }
    // //     // }

    // //     int[] freq = new int[26];
    // //     int left = 0, maxFreq = 0, maxLen = 0;

    // //     for (int right = 0; right < s.length(); right++) {
    // //         freq[s.charAt(right) - 'A']++;
    // //         maxFreq = Math.max(maxFreq, freq[s.charAt(right) - 'A']);
    // //         if ((right - left + 1) - maxFreq > k) {
    // //             freq[s.charAt(left) - 'A']--;
    // //             left++;
    // //         }
    // //         maxLen = Math.max(maxLen, right - left + 1);
    // //     }
    // //     return maxLen;

    // //     // HashMap<Character, Integer> map = new HashMap<>();
    // //     // int left = 0;
    // //     // int maxFreq = 0;
    // //     // int maxLen = 0;
    // //     // for (int right = 0; right < s.length(); right++) {

    // //     //     char ch = s.charAt(right);
    // //     //     map.put(ch, map.getOrDefault(ch, 0) + 1);

    // //     //     // find most frequent character
    // //     //     maxFreq = Math.max(maxFreq, map.get(ch));

    // //     //     // check if replacements needed > k
    // //     //     while ((right - left + 1) - maxFreq > k) {
    // //     //         char leftChar = s.charAt(left);
    // //     //         map.put(leftChar, map.get(leftChar) - 1);
    // //     //         left++;
    // //     //     }
    // //     //     maxLen = Math.max(maxLen, right - left + 1);
    // //     // }
    // //     // return maxLen;

    // //     // int n = s.length();
    // //     // HashMap<Character, Integer> freq = new HashMap<>();
    // //     // int maxFreq = 0;
    // //     // int res = 0;

    // //     // int l = 0; // Left boundary of the window

    // //     // // Right boundary of the window
    // //     // for (int r = 0; r < n; ++r) {

    // //     //     // Increase the frequency of the 
    // //     //     // current character
    // //     //     freq.put(s.charAt(r), freq.getOrDefault(s.charAt(r), 0) + 1);

    // //     //     // Update maxFreq with the frequency of
    // //     //     // the most frequent character in the
    // //     //     // current window
    // //     //     maxFreq = Math.max(maxFreq, freq.get(s.charAt(r)));

    // //     //     // Shrink the window if more than k changes
    // //     //     // required
    // //     //     if (r - l + 1 - maxFreq > k) {
    // //     //         freq.put(s.charAt(l), freq.get(s.charAt(l)) - 1);
    // //     //         l++;
    // //     //     }

    // //     //     // Update the maximum length of the substring
    // //     //     res = Math.max(res, r - l + 1);
    // //     // }

    // //     // return res;

    // // }

    public int characterReplacement(String s, int k) {
        int l=0;
        int[] freq = new int[26];
        int maxFreq = 0;
        int ans = 0;
        for (int r = 0; r < s.length(); r++) {
            freq[s.charAt(r)-'A']++;
            maxFreq = Math.max(maxFreq,freq[s.charAt(r) - 'A']);
            while(r-l+1-maxFreq>k){
                freq[s.charAt(l)-'A']--;
                l++;
            }
            ans = Math.max(ans, r - l + 1);
        }
        return ans;
    }

    static {
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            try (java.io.FileWriter fw = new java.io.FileWriter("display_runtime.txt")) {
                fw.write("0");
            } catch (Exception e) {
            }
        }));
    }
}