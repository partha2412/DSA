class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max = 0;
        int min = 0;
        for(int e:piles){
            max = Math.max(max, e);
            min = Math.min(min, e);
        }
        int l=1,r=max;
        

        while(l<r){
            int m = l+((r-l)/2);
            if(canEat(piles, m, h))
                r=m;
            else
                l=m+1;
        }
        return l;
    }
    private boolean canEat(int[] piles, int m, int h){
        int hour = 0;
        for(int e:piles){
            hour += e/m;
            if(e%m!=0)
                hour+=1;
        }
        return hour<=h;
    }
}