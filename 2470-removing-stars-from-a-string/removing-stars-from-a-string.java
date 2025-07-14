class Solution {
    public String removeStars(String s) {
        int n=s.length();
        Stack <Character> stack=new Stack<>();
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(ch!='*'){
                stack.push(ch);
            }
            else if(!stack.isEmpty()){
                stack.pop();
            
            }
        }
        StringBuilder res=new StringBuilder();
        while(!stack.isEmpty()){
            res.append(stack.pop());
        }

        return res.reverse().toString();
        
    }
}