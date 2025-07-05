class Solution {
    public int findLucky(int[] arr) {

        HashMap<Integer,Integer> hmap=new HashMap<>();

        int n=arr.length;

        for(int i=0;i<n;i++){
            int num=arr[i];

            hmap.put(num,hmap.getOrDefault(num,0)+1);
        }

        int maxLucky=-1;
        for(int key:hmap.keySet()){
            if(key==hmap.get(key)){
                maxLucky=Math.max(key,maxLucky);
            }
        }

        return maxLucky;
        
    }
}