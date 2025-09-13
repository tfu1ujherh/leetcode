class Solution {
    public int numPairsDivisibleBy60(int[] time) {
        int n=time.length;
        int count=0;
        int freq[]=new int[60];
        for(int i=0;i<n;i++){
            int rem=time[i]%60;
            int compliment=(60-rem)%60;
            count+=freq[compliment];
            freq[rem]++;   
        }
        return count;
        
    }
}