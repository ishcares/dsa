
import java.util.*;
class Solution {
    public int maxProfit(int[] prices) {
        int min =prices[0];
         
          int maxprofit = 0;
           
     
        for(int i =0; i<prices.length;i++){
            if(prices[i]<min){
                min=prices[i];
            }
        
        
        if(prices[i]-min >maxprofit){
                    
                    maxprofit = prices[i]-min;
                 }
               
                
         }
          return maxprofit;

          
    }
     public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the size");
            System.out.println("enter the target");
       int  size = in.nextInt();
            
        int[] p = new int[size];
        for(int i = 0; i < size;i++){
            p [i] = in.nextInt();
        }
        Solution obj = new Solution();
        int ans = obj.maxProfit(p);
        System.out.println("the profit is " +  ans );
    }   
}


    