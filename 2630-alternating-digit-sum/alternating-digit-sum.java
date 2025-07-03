class Solution {
    public int alternateDigitSum(int n) {
        int sum=0;
        int count=1;
        n=rev(n);
        while(n!=0){
            int digit=n%10;
            if(count%2==0){
                digit=-digit;
            }
            sum+=digit;
            n/=10;
            count++;  
        }
        return sum;
    }

    public static int rev(int n){
        int r_num=0;

        while(n!=0){
            int digit=n%10;
            r_num=r_num*10+digit;
            n/=10;
        }
        return r_num;
    }
}