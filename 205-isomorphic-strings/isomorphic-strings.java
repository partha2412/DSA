class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length())
            return false;
        Map<Character, Character> map = new HashMap<>();
        int n = s.length();
        for(int i=0;i<n;i++){
            if(!map.containsKey(s.charAt(i)) ){
                if( map.containsValue(t.charAt(i)))
                    return false;
                map.put(s.charAt(i), t.charAt(i));
            }
            else{
                if( t.charAt(i) != map.get(s.charAt(i)) )
                    return false;
            }
        }
        return true;
    }
}