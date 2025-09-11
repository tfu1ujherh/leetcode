class Solution {
    public String sortVowels(String s) {

        int n=s.length();
        List <Character> arr =new ArrayList<>();
        int c=0;
        StringBuilder res=new StringBuilder();
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(ch=='a' ||ch=='e' || ch=='i' ||ch=='o' ||ch=='u' ||
               ch=='A' ||ch=='E' || ch=='I' ||ch=='O' ||ch=='U'){
            arr.add(ch);
            }
        }
        Collections.sort(arr);
        int a=0;

        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(ch=='a' ||ch=='e' || ch=='i' ||ch=='o' ||ch=='u' ||ch=='A' ||ch=='E' || ch=='I' ||ch=='O' ||ch=='U'){
             res.append(arr.get(a));
             a++;
            }else{
                res.append(s.charAt(i));
            }
        }
        return res.toString();

        
        
    }
}