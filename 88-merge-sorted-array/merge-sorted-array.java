class Solution {
    // public void merge(int[] nums1, int m, int[] nums2, int n) {

    //     // int i =0 ,j = 0;
    //     // while(i<m && j<n){
    //     //     if(nums1[i]<=nums2[j]){
    //     //         i++;
    //     //     }
    //     //     else{
    //     //         nums1[i]=nums2[j];
    //     //         j++;
    //     //     }
    //     //     System.out.println(nums1[i]+" "+i);
    //     // }
    //     // System.out.println(nums1[i]+" "+i);
    //     // if(i!=0)
    //     //     i++;
    //     // while(j<n){
    //     //     nums1[i]=nums2[j];
    //     //     i++;
    //     //     j++;
    //     // }

    //     // for(int i=0;i<nums1.lnegth;i++){
    //     //     for(int j=0;j<nums2.lnegth;j++){
    //     //         if(nums1[i]<nums2[i]){
    //     //             nums1[i]
    //     //         }
    //     //         else if(nums1[i]==numns2[i]){
    //     //              nums1[i+1]=nums1[i];
    //     //              nums1[i] = nums2[i];
    //     //         }
    //     //     }
    //     // }

    //     // int i = m-1;
    //     // int j = n-1;
    //     // int k = m+n-1;
    //     // while(i>=0 && j>=0){
    //     //     if(nums1[i]>nums2[j]){
    //     //         nums1[k]=nums1[i];
    //     //         i--;
    //     //     }
    //     //     else{
    //     //         nums1[k] = nums2[j];
    //     //         j--;
    //     //     }
    //     //     k--;
    //     // }
    //     // while(j>=0){
    //     //     nums1[k] = nums2[j];
    //     //     j--;
    //     //     k--;
    //     // }

    //     // int i=m-1;
    //     // int j=n-1;
    //     // int k=m+n-1;
    //     // while(i>=0 && j>=0){
    //     //     if(nums1[i]>nums2[j]){
    //     //         nums1[k]=nums1[i];
    //     //         i--;
    //     //     }
    //     //     else{
    //     //         nums1[k]=nums2[j];
    //     //         j--;
    //     //     }
    //     //     k--;
    //     // }
    //     // while(j>=0){
    //     //     nums1[k]=nums2[j];
    //     //     j--;
    //     //     k--;
    //     // }
    // }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int res[] = new int[m + n];
        int i = m + n - 1, l = m - 1, r = n - 1;

        while (l >=0 && r >=0) {
            if (nums1[l] < nums2[r]) {
                nums1[i--] = nums2[r--];
            } else {
                nums1[i--] = nums1[l--];
            }
        }
        while(r>=0)
            nums1[i--] = nums2[r--];

    }
}