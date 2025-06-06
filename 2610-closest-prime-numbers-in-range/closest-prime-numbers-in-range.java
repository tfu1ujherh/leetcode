class Solution {
    public int[] closestPrimes(int left, int right) {

        boolean[] isPrime = new boolean[right + 1];
      Arrays.fill(isPrime, true);
      isPrime[0] = isPrime[1] = false;

    for (int i = 2; i * i <= right; i++) {
     if (isPrime[i]) {
        for (int j = i * i; j <= right; j += i) {
            isPrime[j] = false;
        }
    }
}

        List<Integer>list=new ArrayList<>();
        for(int i=left;i<=right;i++){
            if(isPrime[i]==true){
                list.add(i);
            }
        }
        int min=Integer.MAX_VALUE;

        int start=-1;
        int end=-1;
        for(int i=list.size()-1;i>0;i--){
            int curr = list.get(i)-list.get(i-1);
            if(min>=curr){
                min=curr;
                end=list.get(i);
                start=list.get(i-1);
            }
        }

        System.out.println(list);

        return new int[]{start,end};
        
    }
}