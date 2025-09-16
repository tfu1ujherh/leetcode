class Solution {
    public int finalValueAfterOperations(String[] operations) {

        int n=operations.length;
        int res=0;

        for(int i=0;i<n;i++){
            if(operations[i].equals("++X") ||operations[i].equals("X++")){
                res+=1;
            }else if(operations[i].equals("--X") ||operations[i].equals("X--")){
                res-=1;
            }
        }
        return res;
        
    }
}