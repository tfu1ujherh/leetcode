class Solution {
    public boolean isSameAfterReversals(int num) {
        int rev=reverse(reverse(num));
        if(rev==num){
            return true;
        }
        return false; 
    }

    public int reverse(int num){
        int rev=0;
        while(num!=0){
            int digit=num%10;
            rev=rev*10+digit;
            num/=10;
        }
        return rev;
    }
}