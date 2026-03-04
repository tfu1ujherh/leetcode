class Solution {
    public boolean isPalindrome(int x) {

        int temp=x;
        int rev_num=0;

        while(x>0){
            int digit =x%10;
            rev_num=rev_num*10+digit;
            x/=10;
        }

        if(rev_num==temp){
            return true;
        }

        return false;
        
    }
}