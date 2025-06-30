class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer>stack=new Stack<>();

        for(int i=0;i<asteroids.length;i++){
            int asteroid=asteroids[i];
            boolean destroyed=false;
            while(!stack.isEmpty() && asteroid<0 && stack.peek()>0){
                if(Math.abs(asteroid)>stack.peek()){
                    stack.pop();
                    continue;
                }else if(Math.abs(asteroid)==stack.peek()){
                    stack.pop();
                }
                destroyed=true;
                break;
            }
            if(!destroyed){
            stack.push(asteroid);
            }
        }



        int res[]=new int[stack.size()];

        for(int i=res.length-1;i>=0;i--){
            res[i]=stack.pop();
        }
        return res;
        
    }
}