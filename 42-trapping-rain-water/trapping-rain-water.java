class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int prefix[]=new int[n];
        int sufix[]=new int[n];
        int res=0;
        prefix[0]=height[0];
        sufix[n-1]=height[n-1];
        for(int i=1;i<n;i++){
            prefix[i]=Math.max(prefix[i-1],height[i]);
        }
        for(int i=n-2;i>0;i--){
            sufix[i]=Math.max(sufix[i+1],height[i]);
        }
        for(int i=0;i<n-1;i++){
        int left_max=prefix[i],right_max=sufix[i];
        if(height[i]<left_max && height[i]<right_max){
            res+=Math.min(left_max,right_max)-height[i];
        }
        }
        return res;
        
    }
}