class Solution {
    public boolean checkValid(int[][] matrix) {
        int n=matrix.length;
        
        for(int i=0;i<n;i++){
            int freq[]=new int[n+1];
            for(int j=0;j<n;j++){
                freq[matrix[i][j]]++;
            }
            for(int k=1;k<=n;k++){
                if(freq[k]!=1){
                    return false;
                }
            }
        }
        for(int i=0;i<n;i++){
            int freq[]=new int[n+1];
            for(int j=0;j<n;j++){
                freq[matrix[j][i]]++;
            }
            for(int k=1;k<=n;k++){
                if(freq[k]!=1){
                    return false;
                }
            }
        }
        return true;   
    }

}