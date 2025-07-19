class Solution {
    public int lengthOfLongestSubstring(String s) {
      int n=s.length();
      int left=0;
      int right=0;
      int maxLen=0;
      HashMap<Character,Integer>hmap=new HashMap<>();
      while(right<n){
        if(hmap.containsKey(s.charAt(right))){
            left=Math.max(left,hmap.get(s.charAt(right))+1);
        }
         hmap.put(s.charAt(right),right);
         maxLen=Math.max(maxLen,right-left+1);
         right++;
      }
      return maxLen;
    }
}