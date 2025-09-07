class Solution {
    public int[] sumZero(int n) {

        int res[]=new int[n];
        int count=0;

        for(int i=1;i<=n/2;i++){
            res[count++]=i;
            res[count++]=-i;
        }
        if(n%2!=0){
            res[count]=0;
        }
        return res;
        
    }
}