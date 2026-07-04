class Solution {
    public int search(int[] nums, int target) {
        // 1 2 3 4 5 6 
        // 5 6 1 2 3 4    mid = 2
        //4 5 6 1 2 3 
       // 3 4 5 6 1 2  

        int l=0;
        int r=nums.length-1;
     int mid=0;
        while(l<=r){
          mid= l+(r-l)/2;
        
        if(target==nums[mid])return mid ;

         if(nums[mid]>=nums[l]){

            if(target<nums[mid] && target>=nums[l])r=mid-1;
           else {
            l=mid+1;
           }
           continue;
         }

         else if(nums[r]>=nums[mid]){

           if(target>nums[mid] && target<=nums[r]) l=mid+1;
            
            else {
                r =mid -1 ;
            }
            continue;
         }
  
    
 

        }
        return -1;
    }
}
 