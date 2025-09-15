class Solution {
    public int minOperations(int[][] grid, int x) {
        int n=grid.length;
        int m=grid[0].length;
        int size=n*m;
        int arr[]=new int[size];
        int k=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[k++]=grid[i][j];
            }
        }
        Arrays.sort(arr);
        int res=0;
        int median=arr[size/2];
        for(int i=0;i<k;i++){
            if((arr[i]-median)%x!=0){
                return -1;
            }
            int num=Math.abs(arr[i]-median);
            res+=num/x;
        }

        return res;
        
    }
}