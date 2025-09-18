class Solution {
    public int peakIndexInMountainArray(int[] nums) {

        int n=nums.length;
        int max=Integer.MIN_VALUE;
        int ind=-1;
        for(int i=1;i<n-1;i++){

            if(nums[i]>nums[i-1] && nums[i]>nums[i+1]){
                max=Math.max(max,nums[i]);
                ind=i;
            }

        }

        return ind;
        
    }
}