class Solution {
    public int characterReplacement(String s, int k) {
       // A B C D   K=3
        HashMap<Character,Integer> map=new HashMap<>();

        int max=0;
        int l=0 ;
        int maxsub=0;
        
        for(int r=0;r<s.length();r++){
            map.put(s.charAt(r),map.getOrDefault(s.charAt(r),0)+1);
         max=Math.max(max,map.get(s.charAt(r)));

        

         if(r-l+1-max >k){
             map.put(s.charAt(l),map.getOrDefault(s.charAt(l),0)-1);
            l++;
            
         }
         else {
            maxsub=Math.max(maxsub,r-l+1);
         }

        }
     return maxsub;
    }}
