class Solution {
    public int differenceOfSum(int[] nums) {
        int n=nums.length;
        int sum=0;
      

        int sum2=0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
            if(nums[i]>9){
                while(nums[i]!=0){
                    int digit=nums[i]%10;
                    sum2+=digit;
                    nums[i]/=10;
                    
                }
            }else{
                sum2+=nums[i];
            }
            
        }

        int res=Math.abs(sum-sum2);
        return res;
        
        
    }
}