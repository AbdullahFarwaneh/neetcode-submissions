class Solution {
    public int[] twoSum(int[] nums, int target) {

    HashMap<Integer,Integer> map=new HashMap<>();
     


    for(int i=0;i<nums.length;i++){

        map.put(nums[i],i);

    } 
    for(int j=0;j<nums.length;j++){

        int secondVal= target-nums[j];

     if(map.containsKey(secondVal)&&j!=map.get(secondVal)){

     return new int [] {j,map.get(secondVal)};}
     
    }

 
  return new int []{-1,-1};

    }
    }
