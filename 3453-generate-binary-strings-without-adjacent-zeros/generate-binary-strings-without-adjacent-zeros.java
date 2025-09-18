class Solution {
    public List<String> validStrings(int n) {

        List<String> res =new ArrayList<>();
        StringBuilder str=new StringBuilder();
        solve(res,str,n,0,'1');
        return res;
        
    }

    public void solve(List<String> res ,StringBuilder str ,int n,int index,char lastChar){
        if(index==n){
            res.add(str.toString());
            return;
        }
        str.append('1');
        solve(res,str,n,index+1,'1');
        str.deleteCharAt(str.length()-1);

        if(lastChar!='0'){
            str.append('0');
            solve(res,str,n,index+1,'0');
            str.deleteCharAt(str.length()-1);
        }
    }
}