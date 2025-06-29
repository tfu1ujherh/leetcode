class Solution {
    public List<String> generateParenthesis(int n) {
        List <String>result=new ArrayList<>();
        String ans="";

        solve(n,result,ans,0,0);
        return result;
    }


    public static void solve(int n,List <String>result,String ans,int open,int close){

        if(open==n && close==n){
            result.add(ans);
        }
        else{
            if(open<n){
                solve(n,result,ans+"(",open+1,close);
            }
             if(open>close){

                solve(n,result,ans+")",open,close+1);

            }
        }
    }



}