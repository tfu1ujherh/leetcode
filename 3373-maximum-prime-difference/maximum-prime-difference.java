class Solution {
    public int maximumPrimeDifference(int[] nums) {
        int n=nums.length;
        List<Integer>list=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(isPrime(nums[i]) && nums[i]>1){
                list.add(i);
            }
        }

        if(list.size()==0){
            return 0;

        }

        System.out.println(list);
        int first=0;
        int last=0;
        if(!list.isEmpty()){
         first=list.get(0);
         last=list.get(list.size()-1);
        }
        int res=last-first;
        return res;
    }
    public static boolean isPrime(int num){
        boolean prime=true;
        for(int i=2;i<=Math.sqrt(num);i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
}