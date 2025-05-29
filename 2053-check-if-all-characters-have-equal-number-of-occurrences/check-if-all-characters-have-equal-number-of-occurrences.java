class Solution {
    public boolean areOccurrencesEqual(String s) {


        HashMap<Character,Integer> hmap=new HashMap<>();

        int n=s.length();

        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            hmap.put(ch,hmap.getOrDefault(ch,0)+1);
        }

        int num=-1;

        for(int count:hmap.values()){
            if(num==-1){
                num=count;
            }
            else if(num !=count){
                return false;
            }
        }

        return true;
        
    }
}