class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        int n=dimensions.length;
        int m=dimensions[0].length;
        int area=Integer.MIN_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                int num1=dimensions[i][0];
                int num2=dimensions[i][1];
                int num=(num1*num1)+(num2*num2);
                int a=num1*num2;
                if(num>max){
                    max=num;
                    area=a;   
                }else if(num==max){
                    area=Math.max(area,a);
                }
            }
        }
        return area;        
    }
}