class Solution {
    public int[] productExceptSelf(int[] nums) {


// 1 1 2 8 
//
        int [] arr= new int [nums.length];
        
      
         int product=1 ;
        for(int i=0;i<nums.length;i++){
            arr[i]= product;
         product*=nums[i];
             
        }
//  48   24    6   1 
  product =1 ;
  

        for(int i=nums.length-1;i>=0;i--){
             arr[i]*=product;
             product=product*nums[i];
        }

 
return arr;
    }
}  
