class Solution {
    public int numSub(String s) {
        int n=s.length();
        long count=0;
        long res=0;
        int mod=1000000007;

        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(ch=='1'){
                count++;
            }
            else{
                res+=count*(count+1)/2;
                res%=mod;
                count=0;
            }
        }

        if(count>0){
        res+=count*(count+1)/2;
        res%=mod;
        }

        return (int)res;
        
    }
}