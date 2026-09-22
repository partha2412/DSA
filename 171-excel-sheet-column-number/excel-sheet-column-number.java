class Solution {
    public int titleToNumber(String columnTitle) {
        int n = columnTitle.length();
        int res=0;
        for(int i=0;i<n;i++){
            char c = columnTitle.charAt(i);
            res+=(c-'A'+1)*Math.pow(26,n-i-1);
        }
        return res;
    }
}