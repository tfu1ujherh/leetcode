class Solution {
    public String[] sortPeople(String[] names, int[] heights) {

        int n=names.length;
        int m=heights.length;
        for(int i=0;i<m;i++){
            int max=i;
            for(int j=i+1;j<n;j++){
                if(heights[j]>heights[max]){
                    max=j;
                }
            }
            int tempH = heights[i];
            heights[i] = heights[max];
            heights[max] = tempH;

            String temp=names[i];
            names[i]=names[max];
            names[max]=temp;
        }
        return names;
        
    }
}