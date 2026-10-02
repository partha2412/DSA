class Solution {
    public int[] twoSum(int[] arr, int t) {
        // for(int i=0;i<arr.length;i++){
        //     for(int j=i+1;j<arr.length;j++){
        //         if(arr[i]+arr[j]==target)
        //             return new int[] {i+1,j+1} ;
        //     }
        // }
        // return new int[] {-1,-1};

        // int l = 0;
        // int r = arr.length-1;
        // while(l<r){
        //     if(arr[l]+arr[r]>t)
        //         r--;
        //     else if(arr[l]+arr[r]<t)
        //         l++;
        //     else
        //         return new int[] {l+1,r+1};
        // }
        // return null;// new int[] {-1,-1};

        //practice
        int l=0;
        int r=arr.length-1;

        while(l<=r){
            int sum = arr[l]+arr[r];
            if(sum==t)
                return new int[] {l+1, r+1};
            else if(sum<t)
                l++;
            else if(sum>t)
                r--;
        }
        return null;

    }
}