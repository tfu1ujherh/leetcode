class Solution {
    public int longestValidParentheses(String s) {

        if(s.length()==0){
            return 0;
        }
        int maxLen=0;
        Stack<Integer>stack=new Stack<>();
        stack.push(-1);

 

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);

            if(ch=='('){
                stack.push(i);
            }else{
                stack.pop();

                if(stack.isEmpty()){
                    stack.push(i);
                }else{
                    maxLen=Math.max(maxLen,i-stack.peek());
                }
            }
            
        }

        return maxLen;
        
    }
}