class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n=isConnected.length;
        boolean visited[]=new boolean [n];

        int count=0;
        for(int i=0;i<n;i++){
            if(!visited[i]){
                dfs(isConnected,visited,i);
                count++;
            }
        }
        return count;
        
    }

    public void dfs(int isConnected[][],boolean[] visited,int startVertex){
        int n=isConnected.length;
        Stack<Integer> stack =new Stack<>();
        stack.push(startVertex);
        while(!stack.isEmpty()){
            int cur=stack.pop();
            if(!visited[cur]){
                visited[cur]=true;
                for(int i=0;i<n;i++){
                    if(isConnected[cur][i]==1 && !visited[i]){
                        stack.push(i);
                    }
                }

            }
        }
    }
}