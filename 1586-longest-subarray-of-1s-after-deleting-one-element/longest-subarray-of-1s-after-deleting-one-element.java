class Solution {
    public int longestSubarray(int[] nums) {

        int count=0;
        int left=0;
        int maxLen=Integer.MIN_VALUE;
        for(int right=0;right<nums.length;right++){
            if(nums[right]==0){
                count++;
            }
            while(count>1){
                if(nums[left]==0){
                    count--;
                }
                left++;
            }
            maxLen=Math.max(maxLen,right-left);
        }

        return maxLen;
        
    }
}