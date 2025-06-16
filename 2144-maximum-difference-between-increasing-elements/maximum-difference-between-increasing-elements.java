class Solution {
    public int maximumDifference(int[] nums) {
        int n=nums.length;
        int min=Integer.MAX_VALUE;
        int max=-1;
        for(int i=0;i<n;i++){
            if(nums[i]<min){
                min=nums[i];
            }
            if(nums[i]>min){
            max=Math.max(nums[i]-min,max);
            }
        }
        return max;
        
    }
}