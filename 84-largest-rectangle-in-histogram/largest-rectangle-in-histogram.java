class Solution {
    public int largestRectangleArea(int[] heights) {

        int n=heights.length;

        int max=0;

        Stack<Integer>stack=new Stack<>();

        for(int i=0;i<n;i++){
            while(!stack.isEmpty() && heights[i]<heights[stack.peek()]){
                int bar=stack.pop();
                int pse=stack.isEmpty()?-1:stack.peek();
                int nse=i;
                max=Math.max(max,heights[bar]*(nse-pse-1));
            }
            stack.push(i);
        }

        while(!stack.isEmpty()){
            int bar=stack.pop();
            int pse=stack.isEmpty()?-1:stack.peek();
            int nse=n;
            max=Math.max(max,heights[bar]*(nse-pse-1));
        }

        return max; 
    }
}