class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int n=nums.length;
        List<Integer> res=new ArrayList<>();
        HashMap<Integer,Integer> hmap=new HashMap<>();
        for(int i=0;i<n;i++){
            int num=nums[i];
            if(hmap.containsKey(num)){
                res.add(num);
            }
            hmap.put(num,i);
        }
        return res;
        
    }
}