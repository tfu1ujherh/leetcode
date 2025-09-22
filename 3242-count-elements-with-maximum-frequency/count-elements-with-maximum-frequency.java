class Solution {
    public int maxFrequencyElements(int[] nums) {
        int n=nums.length;
        HashMap<Integer,Integer> hmap=new HashMap<>();
        for(int i=0;i<n;i++){
            int num=nums[i];
            hmap.put(num,hmap.getOrDefault(num,0)+1);
        }

        int max=Integer.MIN_VALUE;
        for(Map.Entry<Integer,Integer> entry:hmap.entrySet()){
            int num=entry.getValue();
            max=Math.max(max,num);
        }
        int count=0;

        for(Map.Entry<Integer,Integer> entry:hmap.entrySet()){
            int num=entry.getValue();
            if(num==max){
                count++;
            }
        }

        return count*max;

        
        
    }
}