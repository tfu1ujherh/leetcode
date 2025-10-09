class Solution {
    public List<Integer> findDuplicates(int[] nums) {

        List<Integer> res=new ArrayList<>();

        HashSet<Integer> set=new HashSet<>();

        int n=nums.length;
        for(int i=0;i<n;i++){
            int num=nums[i];

            if(set.contains(num)){
                res.add(num);
            }

            set.add(num);
        }
        return res;
        
    }
}