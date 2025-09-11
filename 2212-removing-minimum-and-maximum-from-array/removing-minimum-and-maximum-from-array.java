class Solution {
    public int minimumDeletions(int[] nums) {
        int n=nums.length;
        if(n==1 || n==2){
            return n;
        }
        int min=nums[0];
        int max=nums[0];
        int min_index=0;
        int max_index=0;
        for(int i=1;i<n;i++){
            if(nums[i]<min){
                min=nums[i];
                min_index=i;
            }
            if(nums[i]>max){
                max=nums[i];
                max_index=i;
            }
        }
        
        int bothFront=Math.max(min_index,max_index)+1;
        int bothBack=n-Math.min(min_index,max_index);
        int FrontandBack=(min_index + 1) + (n - max_index);
        int center=(max_index + 1) + (n - min_index);

        int res=Math.min(Math.min(bothFront,bothBack),Math.min(FrontandBack,center));
        return res;

        
    }
}