class Solution {
    public int characterReplacement(String s, int k) {
        int n=s.length();
        int freq[]=new int[26];
        int maxFreq=0;
        int left=0;
        int res=0;
        for(int right=0;right<n;right++){
            char ch=s.charAt(right);
            freq[ch-'A']++;
            maxFreq=Math.max(maxFreq,freq[ch-'A']);
            if((right-left+1)-maxFreq>k){
                freq[s.charAt(left)-'A']--;
                left++;
            }
             res=Math.max(res,right-left+1);
        }
        return res;
       
        
    }
}