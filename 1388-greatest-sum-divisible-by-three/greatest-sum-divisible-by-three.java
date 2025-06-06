class Solution {
    public int maxSumDivThree(int[] nums) {

        int n=nums.length;

        int dp[]=new int[3];

        for(int i=0;i<n;i++){
            int temp[]=dp.clone();

            for(int j=0;j<3;j++){
                int num=temp[j]+nums[i];
                dp[num%3]=Math.max(dp[num%3],num);
            }
        }

        return dp[0];
        
    }
}