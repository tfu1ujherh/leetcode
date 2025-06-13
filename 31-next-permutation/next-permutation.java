class Solution {
    public void nextPermutation(int[] nums) {
        int n=nums.length;
        int index=-1;
        for(int i=n-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                 index=i;
                break;
            }
        }
            if(index!=-1){
            for(int i=n-1;i>index;i--){
                if(nums[i]>nums[index]){
                int temp=nums[index];
                nums[index]=nums[i];
                nums[i]=temp;
                break;
            }
            }
            }
        int low=index+1;
        int high=n-1;
        while(low<high){
            int temp=nums[low];
            nums[low]=nums[high];
            nums[high]=temp;
            low++;
            high--;
        }
        
    }
}