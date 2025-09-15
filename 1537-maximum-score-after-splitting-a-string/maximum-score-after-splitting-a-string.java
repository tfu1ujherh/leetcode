class Solution {
    public int maxScore(String s) {
        int ones=0;
        int n=s.length();
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(ch=='1'){
                ones++;
            }
        }
        
        int res=Integer.MIN_VALUE;
        int zeros=0;
        int right_ones=ones;
        for(int i=0;i<n-1;i++){
            char ch=s.charAt(i);
            if(ch=='0'){
                zeros++;
            }else{
                right_ones--;
            }
            res=Math.max(res,zeros+right_ones);
        }
        return res;   
    }
}