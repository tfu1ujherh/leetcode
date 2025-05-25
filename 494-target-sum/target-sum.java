class Solution {
    public int findTargetSumWays(int[] nums, int target) {

        int n=nums.length;

        int sum=0;

        for(int i=0;i<n;i++){
            sum+=nums[i];
        }

        if((sum+target)%2!=0 || sum<Math.abs(target)){
            return 0;
        }

        int num=(sum+target)/2;

        int dp[][]=new int[n+1][num+1];

        dp[0][0]=1;

        for(int i=1;i<=n;i++){
            for(int j=0;j<=num;j++){
                dp[i][j]=dp[i-1][j];

                if(nums[i-1]<=j){
                    dp[i][j]=dp[i][j]+dp[i-1][j-nums[i-1]];
                }
            }
        }

        return dp[n][num];

        
    }
}