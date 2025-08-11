class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n=isConnected.length;
        boolean visited[]=new boolean [n];

        int count=0;
        for(int i=0;i<n;i++){
            if(!visited[i]){
                bfs(isConnected,visited,i);
                count++;
            }
        }
        return count;
        
    }

    public void bfs(int isConnected[][],boolean[] visited,int startVertex){
        int n=isConnected.length;
        Queue<Integer>queue=new LinkedList<>();
        queue.add(startVertex);
        visited[startVertex]=true;
        while(!queue.isEmpty()){
            int cur=queue.poll();
            for(int i=0;i<n;i++){
                if(isConnected[cur][i]==1 && !visited[i]){
                    visited[i]=true;
                    queue.add(i);
                }
                
            }
        }
       
        }
    }
