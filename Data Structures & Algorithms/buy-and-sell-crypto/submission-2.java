class Solution {
    public int maxProfit(int[] prices) {
    

    // maxprofit= coinPrice- max price of the rest days
    //max of the rest days is max but i not included


    int max=0;
    int profit=0;
    int maxprofit=0;

    for(int i=0;i<prices.length;i++){

        for(int j =i+1;j<prices.length;j++){
             
            max=Math.max(max,prices[j]);
        }
        profit=max-prices[i];
        
        maxprofit=Math.max(maxprofit,profit );
        max=0;
    }

return maxprofit;
    }
}
