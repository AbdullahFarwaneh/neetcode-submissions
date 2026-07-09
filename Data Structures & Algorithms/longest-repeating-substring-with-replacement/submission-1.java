class Solution {
    public int characterReplacement(String s, int k) {
       // A B C D   K=3
        HashMap<Character,Integer> map=new HashMap<>();
        int [] arr= new int [26];
        int max=0;
        int l=0 ;
        int maxsub=0;
        
        for(int r=0;r<s.length();r++){
            arr[s.charAt(r)-'A']++;
         max=Math.max(max,arr[s.charAt(r)-'A']);

        

         if(r-l+1-max >k){
             arr[s.charAt(l)-'A']--;
            l++;
            
         }
         else {
            maxsub=Math.max(maxsub,r-l+1);
         }

        }
     return maxsub;
    }}
