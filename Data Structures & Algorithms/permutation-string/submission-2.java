 class Solution {
    public boolean checkInclusion(String s1, String s2) {
    HashMap <Character,Integer> count1=new HashMap<>();

for(char c :s1.toCharArray()){
    count1.put(c,count1.getOrDefault(c,0)+1);

}
int l=0;
 HashMap <Character,Integer> count2=new HashMap<>();
for(int r=0;r<s2.length();r++){
        count2.put(s2.charAt(r),count2.getOrDefault(s2.charAt(r),0)+1);
if(r-l+1>s1.length()){
    char leftchar=s2.charAt(l);
  count2.put(leftchar,count2.getOrDefault(leftchar,0)-1);
 if( count2.get(leftchar)==0){
count2.remove(leftchar);

 }
 l++;

}
if(count2.equals(count1)){
    return true;
}
}
return false;
    }
}

