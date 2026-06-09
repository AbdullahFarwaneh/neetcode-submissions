 class Solution {


    public boolean checkInclusion(String s1, String s2) {
         HashMap<Character,Integer>map1=new HashMap<>();

         for(int i=0;i<s1.length();i++){
             map1.put(s1.charAt(i), map1.getOrDefault(s1.charAt(i),0)+1);
         }

         HashMap<Character,Integer> map2=new HashMap<>();

         int left=0;
         for (int r=0;r<s2.length();r++){
              
              if(!map1.containsKey(s2.charAt(r))){
                 map2.clear();
                 left=r+1;
                 continue;
                 }

                  if(map1.containsKey(s2.charAt(r))) {
                  map2.put(s2.charAt(r), map2.getOrDefault(s2.charAt(r),0)+1);

                 }

             if(r-left+1==s1.length()) {
                 if(map1.equals(map2)) return true;
                 else {
                 map2.put(s2.charAt(left), map2.get(s2.charAt(left)) - 1);
if(map2.get(s2.charAt(left)) == 0) map2.remove(s2.charAt(left));
left++;
                 
                 }
                     
                  
                 }
                 }


    return false;
 }

 
    }

 
 