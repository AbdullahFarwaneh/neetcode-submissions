class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
 // -4 -1 -1  0 1 2 2 
 Arrays.sort(nums);
List<List<Integer>> list =new ArrayList<>();
 for(int i=0;i<nums.length-2;i++){

    int r=nums.length-1;
    int l=i+1;
if (i > 0 && nums[i] == nums[i - 1]) {
        continue;
    }
    while(l<r){

        int sum =nums[i]+nums[l]+nums[r];

        if(sum==0){
            list.add(Arrays.asList(nums[i],nums[l],nums[r]));
            
            r--;
            l++;

        while(l<r &&  nums[l]==nums[l-1])l++;

      while( l<r && nums[r]==nums[r+1])r--;
        }
        
        else if(sum>0)r--;

        else{
            l++;
        }

       

    }


 }
return list;
    }}
