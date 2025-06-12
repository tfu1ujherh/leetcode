class Solution {
    public long zeroFilledSubarray(int[] nums) {

        int n=nums.length;
        long res=0;
        int count=0;
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                count++;
            }
            if(nums[i]!=0){
                if(count>=2){
                 res+=(long)count*(long)(count+1)/2;
                }else{
                    res+=count;
                }
                count=0;
            }
            
        }

        res+=(long)count*(long)(count+1)/2;
        return res;
        
    }
}