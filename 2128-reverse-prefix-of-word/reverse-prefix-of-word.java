class Solution {
    public String reversePrefix(String word, char ch) {

        StringBuilder res=new StringBuilder();
        int index=index(word,ch);
        for(int i=index;i>=0;i--){
            char c=word.charAt(i);
            res.append(c);
        }

        for(int i=index+1;i<word.length();i++){
            char c=word.charAt(i);
            res.append(c);
        }
        return res.toString();
        
    }
    public static int index(String word ,char ch){
        for(int i=0;i<word.length();i++){
            if(word.charAt(i)==ch){
                return i;
            }
        }

        return -1;
    }
}