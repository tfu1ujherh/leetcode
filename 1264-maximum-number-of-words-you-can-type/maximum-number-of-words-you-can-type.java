class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {

        String words[]=text.split(" ");
        int count =0;

        for(int i=0;i<words.length;i++){
            String str=words[i];

            boolean isValid=true;
            for(int j=0;j<str.length();j++){
                char sch=str.charAt(j);
                if(brokenLetters.indexOf(sch) !=-1){
                    isValid=false;
                    break;
                }
                }
                if(isValid){
                    count++;
                }
            }
        
        
        return count;
    }
}