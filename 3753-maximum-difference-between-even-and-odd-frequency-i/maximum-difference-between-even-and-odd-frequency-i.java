class Solution {
    public int maxDifference(String s) {

        int n=s.length();

        int freq[]=new int[26];
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            freq[ch-'a']++;
        }

        int oddf=Integer.MIN_VALUE;
        int evenf=Integer.MAX_VALUE;
        for(int i=0;i<26;i++){
            if(freq[i]%2!=0 && freq[i]!=0){
                oddf=Math.max(oddf,freq[i]);
            }
            if(freq[i]%2==0 && freq[i]!=0){
                evenf=Math.min(evenf,freq[i]);

            }
        }
        int res=oddf-evenf;
        return res;

        
    }
}