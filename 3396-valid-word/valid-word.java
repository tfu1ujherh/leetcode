class Solution {
    public boolean isValid(String word) {

        if(word.length()<3){
            return false;
        }

        boolean hasVowel=false;
        boolean hasConstant=false;

        for(int i=0;i<word.length();i++){
            char ch=word.charAt(i);

            if(!Character.isLetterOrDigit(ch)){
                return false;
            }

            if(Character.isLetter(ch)){
                char lower=Character.toLowerCase(ch);
                if(lower=='a'|| lower=='e' || lower=='i' || lower=='o'|| lower=='u'){
                    hasVowel=true;
                }else{
                    hasConstant=true;
                }
            }
        }

        return hasVowel && hasConstant;

        
    }
}