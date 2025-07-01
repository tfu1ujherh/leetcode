class Solution {
    public long[] findPrefixScore(int[] nums) {
        int n=nums.length;
        long res[]=new long[n];
        res[0]=nums[0]*2;
        int max=nums[0];
        for(int i=1;i<n;i++){
            int num=nums[i];
            max=Math.max(max,num);
            if(num<max){
                num=num+max;
            }else{
                num=num*2;
            }
            long cur=num+res[i-1];
            res[i]=cur;
        }
        return res;
        
    }
}