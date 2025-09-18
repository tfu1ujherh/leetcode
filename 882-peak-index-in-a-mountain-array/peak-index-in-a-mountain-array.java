class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int n=arr.length;
        int low=0;
        int high=n-1;
        int ans=0;
        while(low<high){
            int mid=low+(high-low)/2;
            if(arr[mid]>arr[mid+1]){
                high=mid;
                ans=mid;
            }else{
                low=mid+1;
            }

        }

        return ans;
        
    }
}