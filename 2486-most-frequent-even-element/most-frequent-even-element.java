class Solution {
    public int mostFrequentEven(int[] nums) {
        int n=nums.length;
        HashMap<Integer, Integer> hmap=new HashMap<>();
        for(int i=0;i<n;i++){
            int num=nums[i];
            if(num%2==0){
            hmap.put(num,hmap.getOrDefault(num,0)+1);
            }
        }
        int res=-1;
        int maxFreq=0;
        for(Map.Entry<Integer,Integer> entry :hmap.entrySet()){
            int key=entry.getKey();
            int freq=entry.getValue();

            if(freq>maxFreq || (freq==maxFreq && key<res)){
                maxFreq=freq;
                res=key;
            }
        
        }
        return res;
        
    }
}