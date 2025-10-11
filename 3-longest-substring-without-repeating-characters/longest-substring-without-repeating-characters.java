class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        HashMap<Character,Integer> hmap=new HashMap<>();
        int len=0;
        int left=0;
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(hmap.containsKey(ch)){
                left=Math.max(left,hmap.get(ch)+1);
            }
            hmap.put(ch,i);
            len=Math.max(len,i-left+1);
        }

        return len;
        
    }
}