class Solution {
    public int maxProfit(int[] prices) {
    int left = 0;
    int right= 1;
    int profit = 0; 
    int max =0;
    while(right<prices.length){
  if(prices[left]<prices[right]){
       max = prices[right]-prices[left];
        profit = Math.max(profit,max);
        right++;
     }
      else if(prices[left]>=prices[right]){
        left=right;
        right++;
      }
    }  
    
 return profit;    
 }

}