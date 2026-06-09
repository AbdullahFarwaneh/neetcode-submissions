class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String,List<String>> map=new HashMap<>();

        for(String s:strs){
            char [] arr=s.toCharArray();
            Arrays.sort(arr);
           String word= new String (arr);
           map.put(word,new ArrayList<>());

        }


        for (int i=0;i<strs.length;i++){
            String original=strs[i];
            char [] arr=original.toCharArray();
            Arrays.sort(arr);
           String word= new String (arr);
            
            map.get(word).add(original); 
           
        }
        return new ArrayList<>(map.values());
        
    }


}