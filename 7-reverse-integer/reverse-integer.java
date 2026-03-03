class Solution {
    public int reverse(int x) {

        long rev_num=0;


        while(x!=0){
            int digit=x%10;
            rev_num=rev_num*10+digit;
            x/=10;
        }
        if(rev_num>Integer.MAX_VALUE || rev_num<Integer.MIN_VALUE){
            return 0;
        }
        return (int)rev_num;
        
    }
}