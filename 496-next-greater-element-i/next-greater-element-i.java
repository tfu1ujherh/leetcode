class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        Map<Integer,Integer>hmap=new HashMap<>();

        Stack<Integer> stack=new Stack<>();

        for(int i=nums2.length-1;i>=0;i--){
            int num=nums2[i];

            while(!stack.isEmpty() && num>=stack.peek()){
                stack.pop();
            }

            if(!stack.isEmpty()){
                hmap.put(num,stack.peek());
            }else{
                hmap.put(num,-1);
            }
            stack.push(num);
        }

        int res[]=new int[nums1.length];

        for(int i=0;i<nums1.length;i++){
            res[i]=hmap.get(nums1[i]);
        }

        return res;
        
    }
}