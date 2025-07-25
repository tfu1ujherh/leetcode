class Solution {
    public int minMaxGame(int[] nums) {
        int n=nums.length;
        while(n>1){
            int newNums[]=new int[n/2];
            int count=0;
            for(int i=0;i<n;i+=2){
                if(count%2==0){
                    newNums[count]=Math.min(nums[i],nums[i+1]);
                }else{
                    newNums[count]=Math.max(nums[i],nums[i+1]);
                }
                count++;
            }
            nums=newNums;
            n=nums.length;
        }

        return nums[0];
        
    }
}