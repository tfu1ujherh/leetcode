class Solution {
    public String reverseOnlyLetters(String s) {

        char str[]=s.toCharArray();
        int low=0;
        int high=str.length-1;

        while(low<=high){

            if(!Character.isLetter(str[low])){
                low++;
            }else if(!Character.isLetter(str[high])){
                high--;
            }else{
                char ch=str[low];
                str[low]=str[high];
                str[high]=ch;
                low++;
                high--;
            }
        }
        return new String(str);
    }
}