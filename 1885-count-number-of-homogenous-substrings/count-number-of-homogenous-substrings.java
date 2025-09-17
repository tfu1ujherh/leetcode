class Solution {
    public int countHomogenous(String s) {

        int n=s.length();
        long res=0;
        long count=1;
        int mod=1000000007;

        for(int i=1;i<n;i++){
            if(s.charAt(i)==s.charAt(i-1)){
                count++;
            }else{
                res+=count*(count+1)/2;
                res%=mod;
                count=1;

            }
        }
        if(count>0){
            res+=(long)count*(count+1)/2;
            res%=mod;
        }

        return (int) res;
        
    }
}