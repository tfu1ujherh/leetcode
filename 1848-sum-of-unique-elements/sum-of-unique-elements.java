class Solution {
    public int sumOfUnique(int[] nums) {
        int n=nums.length;
        HashMap<Integer,Integer> hmap=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int num=nums[i];
            hmap.put(num,hmap.getOrDefault(num,0)+1);
        }
        int sum=0;
        for(Map.Entry<Integer,Integer> entry:hmap.entrySet()){
            if(entry.getValue()==1){
                sum+=entry.getKey();
            }
        }
        return sum;
        
    }
}