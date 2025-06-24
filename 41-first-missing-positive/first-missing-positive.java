class Solution {
    public int firstMissingPositive(int[] nums) {
        int n=nums.length;
        HashMap<Integer,Integer> hmap=new HashMap<>();
        for(int i=0;i<n;i++){
            int num=nums[i];
            if(num>0){
                hmap.put(num,i);
            }
        }
        int i=1;
        while(true){
            if(!hmap.containsKey(i)){
                return i;
            }
            i++;
        }
    }
}