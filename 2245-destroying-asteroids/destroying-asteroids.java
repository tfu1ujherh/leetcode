class Solution {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
        Arrays.sort(asteroids);
        int n=asteroids.length;
        long l_sum=mass;

        for(int i=0;i<n;i++){
            if(asteroids[i]>l_sum){
                return false;
            }
                l_sum+=asteroids[i];
        }
        return true;

    }
}