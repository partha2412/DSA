class Solution {
    // public double findMedianSortedArrays(int[] nums1, int[] nums2) {
    //     int n = nums1.length+nums2.length;
    //     int res[] = new int[n];
    //     int l = 0;
    //     int r = 0;
    //     int i = 0;
    //     while(l<nums1.length && r<nums2.length){
    //         if(nums1[l]<nums2[r]){
    //             res[i]=nums1[l];
    //             l++;
    //         }
    //         else{
    //             res[i]=nums2[r];
    //             r++;
    //         }
    //         i++;
    //     }
    //     while(l < nums1.length) res[i++] = nums1[l++];
    //     while(r < nums2.length) res[i++] = nums2[r++];

    //     if(n%2==0)
    //         return (double)((res[n/2]+res[(n/2)-1])/2.0);
    //     else
    //         return (double) res[n/2];
    // }

    // public double findMedianSortedArrays(int[] nums1, int[] nums2) {

    //     boolean isEven = (nums1.length+nums2.length)%2==0;
    //     int i=0,j=0;
    //     int count = 0;
    //     while(i<nums1.length || j<nums1.length){
            
    //         if(isEven && count==((nums1.length+nums2.length)/2)-1){
    //             return (double)(nums1[i]+nums2[j])/2;
    //         }
    //         else if(!isEven && count==((nums1.length+nums2.length)/2)){
    //             return (double)Math.min(nums1[i],nums2[j]);
    //         }

    //         if(nums1[i]<nums2[j]){
    //             i++;
    //         }
    //         else{
    //             j++;
    //         }
    //         count++;
    //     }
    //     return (double)-1;
    // }

    public double findMedianSortedArrays(int[] nums1, int[] nums2){
        int totalLen = nums1.length+nums2.length;
        int i=0,j=0, curr = 0, prev=0;
        for(int count=0;count<=totalLen/2;count++){
            prev = curr;
            if(i<nums1.length && (j>=nums2.length || nums1[i]<=nums2[j]))
                curr = nums1[i++];
            else
                curr = nums2[j++];
        }
        if(totalLen%2==0)
            return (double)(curr+prev)/2;
        else
            return (double)curr;
    }
}