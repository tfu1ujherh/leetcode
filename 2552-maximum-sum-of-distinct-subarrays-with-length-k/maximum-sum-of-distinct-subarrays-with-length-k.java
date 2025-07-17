class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int n = nums.length;
        int l = 0 ;
        long sum = 0 , maxSum = 0;
        HashSet<Integer> set = new HashSet<>();
        for(int r = 0;r<n;r++){
            while(set.contains(nums[r])){
                sum -= nums[l];
                set.remove(nums[l++]);
            }
            sum += nums[r];
            set.add(nums[r]);

            if(r-l+1 == k){
                maxSum = Math.max(maxSum, sum);
                sum -= nums[l];
                set.remove(nums[l++]);
                
            }
        }

        return maxSum;
    }
}