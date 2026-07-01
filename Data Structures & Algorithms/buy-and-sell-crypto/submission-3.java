class Solution {
    public int maxProfit(int[] prices) {
    

    // maxprofit= coinPrice- max price of the rest days
    //max of the rest days is max but i not included


    int max=0;
     
    int maxprofit=0;
    int r=prices.length-1;
   int profit=0;
    for(int i=0;i<prices.length;i++){

while(r>i){
    max=Math.max(max,prices[r]);
    r--;
}
r=prices.length-1;

 profit=max-prices[i];
maxprofit=Math.max(maxprofit,profit);
        max=0;

    }
    return maxprofit;
    }
}
