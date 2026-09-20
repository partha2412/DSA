class Solution {
    public int reverseDegree(String s) {
        int sum=0;
        for(int i=0;i<s.length();i++){
            int val = s.charAt(i)-'a';
            int prod = (26-val)*(i+1);
            sum+=prod;
        }
        return sum;
    }
}