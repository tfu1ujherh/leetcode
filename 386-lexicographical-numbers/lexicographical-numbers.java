class Solution {
    public List<Integer> lexicalOrder(int n) {
        int cur=1;

        List<Integer>list=new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(cur);
            if(cur*10<=n){
                cur*=10;
            }else{
                while(cur%10==9 || cur+1>n){
                    cur/=10;
                }
                cur++;
            }
            
        }

        return list;
        
    }
}