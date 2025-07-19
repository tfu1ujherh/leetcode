class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n  = s.length(), l = 0 , maxLen = 0;
        HashSet<Character> set = new HashSet<>();
        for(int r = 0;r<n;r++){
            while(set.contains(s.charAt(r))){
                set.remove(s.charAt(l++));
            }

            set.add(s.charAt(r));
            maxLen = Math.max(maxLen , r-l+1);
        }
        return maxLen;
    }
}