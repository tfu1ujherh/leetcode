class Solution {
    public long[] findPrefixScore(int[] nums) {
        int n=nums.length;
        long res[]=new long[n];
        res[0]=nums[0]*2;
        int max=nums[0];
        for(int i=1;i<n;i++){
            // int num=nums[i];
            max=Math.max(max,nums[i]);
            if(nums[i]<max){
                nums[i]=nums[i]+max;
            }else{
                nums[i]=nums[i]*2;
            }
            long cur=nums[i]+res[i-1];
            res[i]=cur;
        }
        return res;
        
    }
}