class Solution {
    public int titleToNumber(String columnTitle) {
        int res=0;

        for(int i=0;i<columnTitle.length();i++){
            char ch=columnTitle.charAt(i);
            int val=ch-'A'+1;
            res=res*26+val;
        }
        return res;
        
    }
}