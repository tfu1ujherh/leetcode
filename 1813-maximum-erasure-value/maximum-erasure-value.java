class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int n=nums.length;
        HashSet<Integer> set=new HashSet<>();
        int sum=0;
        int left=0;
        int maxi = 0;
        for(int right=0;right<n;right++){
            while(set.contains(nums[right])){
                sum-=nums[left];
                set.remove(nums[left++]);
            }
            set.add(nums[right]);
            sum+=nums[right];
            maxi = Math.max(maxi,sum);
        }
        return maxi;
        
    }
}