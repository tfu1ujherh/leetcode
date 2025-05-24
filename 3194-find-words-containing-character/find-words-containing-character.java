class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {

        List<Integer> res=new ArrayList<>();

        for(int i=0;i<words.length;i++){
            String s=Character.toString(x);
            if(words[i].contains(s)){
                res.add(i);
            }
        }

        return res;
        
    }
}