class Solution {
    public int maximumValue(String[] strs) {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<strs.length;i++){
            max=Math.max(max,solve(strs[i]));
        }
        return max;


        
    }

    public static int solve(String str){
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch>='a' && ch<='z'){
                return str.length();
            }
        }
        return Integer.parseInt(str);
    }
}