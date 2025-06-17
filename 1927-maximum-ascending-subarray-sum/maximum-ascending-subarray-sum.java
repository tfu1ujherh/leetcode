class Solution {
    public int maxAscendingSum(int[] nums) {
        int n=nums.length;
        int sum=0;
        int cur=nums[0];
        for(int i=1;i<n;i++){
            if(nums[i]>nums[i-1]){
                cur+=nums[i];
            }else{
            sum=Math.max(cur,sum);
            cur=nums[i];
            }
        }
        sum=Math.max(cur,sum);
        
        return sum;
        
    }
}