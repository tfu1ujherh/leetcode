class Solution {
    public int minNumber(int[] nums1, int[] nums2) {
       HashSet<Integer> set=new HashSet<>();
       int min_common=Integer.MAX_VALUE;
       for(int i=0;i<nums1.length;i++){
        set.add(nums1[i]);
       }
       for(int i=0;i<nums2.length;i++){
        if(set.contains(nums2[i])){
            min_common=Math.min(min_common,nums2[i]);
        }
       }
       if(min_common!=Integer.MAX_VALUE){
        return min_common;
       }
        int min1=Integer.MAX_VALUE;
        int min2=Integer.MAX_VALUE;
        for(int i=0;i<nums1.length;i++){
            min1=Math.min(min1,nums1[i]);
        }     for(int i=0;i<nums2.length;i++){
            min2=Math.min(min2,nums2[i]);
        }

        int a=Math.min(min1,min2);
        int b=Math.max(min1,min2);

        int res=a*10+b;
        return res;


        
    }
}