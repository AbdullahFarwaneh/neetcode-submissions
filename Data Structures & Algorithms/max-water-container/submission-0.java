class Solution {
    public int maxArea(int[] heights) {
        
        // container that have bigget area 
        //area = r-l *the smaller element
       
      int  l=0;
       int r=heights.length-1 ;
       int area=0;
       int max =0;

       while(l<r){

         if(heights[l]<heights[r]){
           
         area=(r-l)*heights[l]; 
          max=Math.max(max,area);
         l++;
         continue ;
        }

           if(heights[l]>heights[r]){
         area=(r-l)*heights[r];
          max=Math.max(max,area);
         r--;
         continue ;
        }
       
        area=(r-l)*heights[l];
        max=Math.max(max,area);
        r--;
        l++;
    
       }
return max ;
    }
}
