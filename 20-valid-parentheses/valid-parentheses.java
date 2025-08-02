class Solution {
    public boolean isValid(String s) {
        int n=s.length();
        Stack<Character> stack=new Stack<>();
        int stackpointer=-1;
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(ch=='(' || ch=='[' || ch=='{'){
                stack.push(ch);
            }else{
                if(stack.isEmpty()){
                    return false;
                }
            if(ch==')' && stack.peek() !='(' ||
               ch==']' && stack.peek() !='[' ||
               ch=='}' && stack.peek() !='{'){
                return false;
               }
               stack.pop();
        }
        }
        return stack.isEmpty();
        
    }
}