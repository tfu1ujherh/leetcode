class Solution {
    public String reverseWords(String s) {
        String words[]=s.split(" ");
        StringBuilder res= new StringBuilder();
        for(int i=0;i<words.length;i++){
            String cur=reverse(words[i]);
            res.append(cur);
            if(i<words.length-1){
                res.append(" ");
            }
        }
        return res.toString();
    }
    public static String reverse(String str){
        char arr[]=str.toCharArray();
        int low=0;
        int high=str.length()-1;
        while(low<=high){
            char temp=arr[low];
            arr[low]=arr[high];
            arr[high]=temp;
            low++;
            high--;
        }
        return new String(arr);
    }
}