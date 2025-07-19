class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum=0;
        int left=0;
        double max=Integer.MIN_VALUE;
      
        double res=0;
        for(int right=0;right<nums.length;right++){
            sum+=nums[right];
            if((right-left+1)==k){
                res=sum/(double)k;
                max=Math.max(max,res);
                sum-=nums[left++];
            }
            
        }
        return max;
    }
}