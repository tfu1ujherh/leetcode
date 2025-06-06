class Solution {
    public long countAlternatingSubarrays(int[] nums) {

        int n=nums.length;
        long max=0;
        int i=0;
        int j=0;
        for(i=0,j=0;i<n-1;i++){
            if(nums[i]==nums[i+1]){
                int val=i-j+1;
                max+=(long)val*(long)(val+1)/2;
                j=i+1;  
            }
        }
        int val=n-j;
        max+=(long)val*(long)(val+1)/2;
        return max; 
    }
}