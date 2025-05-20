class Solution {
    public boolean isZeroArray(int[] nums, int[][] queries) {

        int n=nums.length;
        int diff[]=new int[n+1];
        for(int i=0;i<queries.length;i++){
            int start=queries[i][0];
            int end=queries[i][1];
            diff[start]-=1;
            if(end+1<n){
                diff[end+1]+=1;
            }
        }


        int sum=0;
        for(int i=0;i<n;i++){
            sum+=diff[i];
            nums[i]+=sum;
        }

        for(int i=0;i<n;i++){
            if(nums[i]>0){
                return false;
            }
        }

        return true;

    }
}