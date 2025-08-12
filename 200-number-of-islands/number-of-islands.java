class Solution {
    public int numIslands(char[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        if(n==0 || m==0 || grid==null){
            return 0;
        }
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]=='1'){
                    dfs(grid,i,j);
                    count++;
                }
            }
        }
        return count; 
    }

    public static void dfs(char grid[][],int i,int j){
        if(i<0  || i>=grid.length || j<0 || j>=grid[0].length ||grid[i][j]=='0'){
            return;
        }
        grid[i][j]='0';//mark visited
        dfs(grid,i+1,j);
        dfs(grid,i-1,j);
        dfs(grid,i,j+1);
        dfs(grid,i,j-1);
    }
}