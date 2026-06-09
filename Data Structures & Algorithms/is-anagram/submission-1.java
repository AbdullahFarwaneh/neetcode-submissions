class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length()!=t.length())return false ;

        HashMap<Character,Integer> map=new HashMap<>();
        
        char [] arr= s.toCharArray();

        for(char c:arr){

            map.put(c,map.getOrDefault(c,0)+1);
        }

       for(int i=0;i<t.length();i++){
          if (!map.containsKey(t.charAt(i))){
            return false;
          }
         
            int currentfreq=map.get(t.charAt(i));
            map.put(t.charAt(i),currentfreq-1);
            if(currentfreq-1<0)return false ;
        

       }
        return true;
    }
}
