class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        HashSet<Character> set=new HashSet<>();
        int left=0;
        int maxLen=0;
        for(int right=0;right<n;right++){
            while(set.contains(s.charAt(right))){
                set.remove(s.charAt(left++));
                
            }
            set.add(s.charAt(right));
            maxLen=Math.max(maxLen,right-left+1);
            
        }

        return maxLen;
        
    }
}