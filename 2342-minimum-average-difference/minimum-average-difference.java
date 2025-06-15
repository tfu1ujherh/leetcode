class Solution {
    public int minimumAverageDifference(int[] nums) {
        int n=nums.length;
        long sum=0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
        }
        int minIndex=0;
        long mindiff=Integer.MAX_VALUE;
        long leftsum=0;

        for(int i=0;i<n;i++){
            leftsum+=nums[i];
            long rightsum=sum-leftsum;
            long a=leftsum/(i+1);
            long b=(i==n-1)?0:rightsum/(n-i-1);
            long diff=Math.abs(a-b);
            if(diff<mindiff){
                mindiff=diff;
                minIndex=i;
            }
        }

        return minIndex;
        
    }
}