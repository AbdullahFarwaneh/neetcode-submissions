class Solution {
    public boolean isAnagram(String s, String t) {


 
        
    int  [] arr =new int[26];
    int  [] arr2 =new int [26];

    for(char c : s.toCharArray()) {
     arr[c -'a']++;
    }

   for(char c2 : t.toCharArray()) {
     arr2[c2 -'a']++;
    }

 


return Arrays.equals(arr,arr2) ;
    }
}
