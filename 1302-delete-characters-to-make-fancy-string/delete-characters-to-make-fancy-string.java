class Solution {
    public String makeFancyString(String s) {
        int n=s.length();
        if(n==1 ||n==2){
            return s;
        }
        StringBuilder res=new StringBuilder();
        res.append(s.charAt(0));

        for(int i=1;i<n-1;i++){
           if(s.charAt(i-1)!=s.charAt(i) || s.charAt(i)!=s.charAt(i+1)){
            res.append(s.charAt(i));
           }
        }
        res.append(s.charAt(n-1));
        return res.toString();
        
    }
}