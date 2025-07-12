class Solution {
    public int leastInterval(char[] tasks, int n) {

        int freq[]=new int[26];
        for(int i=0;i<tasks.length;i++){
            freq[tasks[i]-'A']++;
        }
        Arrays.sort(freq);
        int max_num=freq[25];
        int count=1;
        for(int i=24;i>=0;i--){
            if(freq[i]==max_num){
                count++;
            }else{
                break;
            }
        }

        int part_count=max_num-1;
        int part_len=n+1;
        int t_slots=part_count*part_len+count;


        return Math.max(tasks.length,t_slots);
        
    }
}