class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n=nums1.length;
        Stack<Integer> st=new Stack<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        int res[]=new int[n];
        for(int num:nums2){
            while(!st.isEmpty() && st.peek()<num){
                map.put(st.pop(),num);

            }
            st.push(num);
        }
        for(int i=0;i<n;i++){
            res[i]=map.getOrDefault(nums1[i],-1);
        }
        return res;
        
    }
}