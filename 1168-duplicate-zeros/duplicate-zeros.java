class Solution {
    public void duplicateZeros(int[] arr) {
        int n=arr.length;
        int temp[]=new int [n];
        int count=0;
        for(int i=0;i<n&& count<n;i++){
            if(arr[i]!=0){
                temp[count++]=arr[i];
            }else{
                temp[count++]=0;
                if(count<n){
                    temp[count++]=0;
                }
            }
           
        }
        for(int i=0;i<n;i++){
            arr[i]=temp[i];
        }
    }
}