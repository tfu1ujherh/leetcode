class Solution {
    public long[] findPrefixScore(int[] nums) {
        int n=nums.length;
        long res[]=new long[n];
        // res[0]=nums[0]*2;
        // int max=nums[0];
        // for(int i=1;i<n;i++){
        //     max=Math.max(max,nums[i]);
        //     if(nums[i]<max){
        //         nums[i]=nums[i]+max;
        //     }else{
        //         nums[i]=nums[i]*2;
        //     }
        //     long cur=nums[i]+res[i-1];
        //     res[i]=cur;
        // }
        // return res;
        int max = 0;
        for(int i=0;i<n;i++){
            if(max<nums[i]){
                max = nums[i];
            }
            if(i==0){
                res[i] = nums[i] + nums[i];
            }
            else{
                int num = max + nums[i];
                res[i] = num + res[i-1];
            }
        }
        return res;
    }
}