class Solution {
    // public int maxScore(int[] cardPoints, int k) {
    //     int lsum = 0;
    //     int rsum = 0;
    //     int n = cardPoints.length;
    //     for(int i=0;i<k;i++){
    //         lsum+=cardPoints[i];
    //     }
    //     for(int j=n-1;j>n-k;j--){
    //         System.out.println(cardPoints[j]);
    //         rsum+=cardPoints[j];
    //     }
    //     return Math.max(lsum,rsum);
    // }

    public int maxScore(int[] cardPoints, int k) {
        int lsum = 0;
        int rsum = 0;
        int n = cardPoints.length;
        int max;
        for(int i=0;i<k;i++){
            lsum+=cardPoints[i];
        }
        int sum = lsum;
        for(int i=0;i<k;i++){
            lsum = lsum - cardPoints[k-1-i];
            rsum = rsum + cardPoints[n-1-i];
            sum = Math.max(sum,rsum+lsum);
        }
        return sum;
    }
}