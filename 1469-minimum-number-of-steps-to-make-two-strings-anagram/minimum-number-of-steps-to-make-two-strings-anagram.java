class Solution {
    public int minSteps(String s, String t) {
        int freq1[]=new int[26];
        int n=s.length();
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            freq1[ch-'a']++;
        }
        int freq2[]=new int[26];
        int m=t.length();
        for(int i=0;i<m;i++){
            char ch=t.charAt(i);
            freq2[ch-'a']++;
        }
        int res=0;
        for(int i=0;i<26;i++){
            if(freq2[i]>freq1[i]){
                res+=(freq2[i]-freq1[i]);
            }
            res+=(freq1[i]-freq2[i]);
        }
        return res;  
    }
}