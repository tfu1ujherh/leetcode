class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        int n=arr.length;
        HashMap<Integer,Integer> hmap=new HashMap<>();

        for(int i=0;i<arr.length;i++){
           int num=arr[i];
           hmap.put(num,hmap.getOrDefault(num,0)+1);

        }
        HashSet<Integer> set=new HashSet<>();

        for(Map.Entry<Integer,Integer> entry :hmap.entrySet()){
            int num=entry.getValue();

            if(set.contains(num)){
                return false;
            }
            set.add(num);
        }
        return true; 
    }
}