class Solution {
    public double average(int[] salary) {

        int min=salary[0];
        int max=salary[0];

        int sum=0;
        int n=salary.length;
        for(int i=0;i<salary.length;i++){
            min=Math.min(min,salary[i]);
            max=Math.max(max,salary[i]);
            sum+=salary[i];

        }
        sum=sum-max-min;
        double res=(double)sum/(n-2);
        return res; 
    }
}