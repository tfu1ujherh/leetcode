class Solution {
    public int maxPower(String s) {
        int n=s.length();
        int count=1;
        int max=1;
        for(int i=1;i<n;i++){
            if(s.charAt(i-1)==s.charAt(i)){
                count++;
                max=Math.max(count,max);
            }else{
                count=1;
            }
            
        }
        return max;
        
    }
}