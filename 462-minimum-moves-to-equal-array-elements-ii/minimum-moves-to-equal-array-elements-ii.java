class Solution {
    public int minMoves2(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        int median=nums[n/2];
        int count=0;
        for(int i=0;i<n;i++){
            count+=Math.abs(nums[i]-median);
        }
        return count;
    }
}