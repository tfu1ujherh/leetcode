class Solution {
    public int maxNumberOfBalloons(String text) {
        int m=text.length();
        HashMap<Character,Integer>hmap=new HashMap<>();
        for(int i=0;i<m;i++){
            char ch=text.charAt(i);
            hmap.put(ch,hmap.getOrDefault(ch,0)+1);
        }

        int b=hmap.getOrDefault('b',0);
        int a=hmap.getOrDefault('a',0);
        int l=hmap.getOrDefault('l',0)/2;
        int o=hmap.getOrDefault('o',0)/2;
        int n=hmap.getOrDefault('n',0);
        int ans=Math.min(Math.min(Math.min(b,a),l),Math.min(o,n));

        return ans;
    }
}