class Solution {
    public int findMaxLength(int[] nums) {
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                nums[i]=-1;
            }
        }
        HashMap<Integer,Integer> hmap=new HashMap<>();
        hmap.put(0,-1);
        int maxLength=0;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=nums[i];

            if(hmap.containsKey(sum)){
                maxLength=Math.max(maxLength,i-hmap.get(sum));
            }else{
                hmap.put(sum,i);
            }

        }
        return maxLength;
        
    }
}