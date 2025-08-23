class Solution {
    public int[] sortEvenOdd(int[] nums) {
        int n =nums.length;

        List<Integer> even =new ArrayList<>();
        List<Integer> odd =new ArrayList<>();

        for(int i=0;i<n;i++){
            if(i%2==0){
                even.add(nums[i]);
            }else{
                odd.add(nums[i]);
            }
        }

        Collections.sort(even);
        odd.sort(Collections.reverseOrder());
        int e=0;
        int o=0;
        for(int i=0;i<n;i++){
            if(i%2==0){
                nums[i]=even.get(e++);
            }else{
                nums[i]=odd.get(o++);
            }
        }

        return nums; 
    }
}