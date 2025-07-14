class Solution {
    int count=0;
    public int numTilePossibilities(String tiles) {
        char arr[]=tiles.toCharArray();
        Arrays.sort(arr);
        boolean visited[]=new boolean[arr.length];
        solve(arr,visited);
        return count;
        
    }

    public  void solve(char arr[],boolean visited[]){
        int n=arr.length;
        
        for(int i=0;i<n;i++){
            if(visited[i]){
                continue;
            }
            if(i>0 && arr[i]==arr[i-1] && !visited[i-1]){
                continue;
            }
            visited[i]=true;
            count++;
            solve(arr,visited);
            visited[i]=false;





        }

    }
}