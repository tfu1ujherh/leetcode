class Solution {
    public int maxFreqSum(String s) {
        int n=s.length();
        int freq[]=new int[26];
        int max_v=0;
        int max_c=0;
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            freq[ch-'a']++;
            if(ch=='a' || ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                max_v=Math.max(max_v,freq[ch-'a']);
            }else{
                max_c=Math.max(max_c,freq[ch-'a']);
            }
        }

        return max_c+max_v;       
    }
}