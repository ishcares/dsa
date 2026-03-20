import java .util.*;
class Solution {
    public int maximumWealth(int[][] accounts) {
       
        int max=0;
   
        for(int i = 0;i<accounts.length ;i++){
            int sum = 0;
            for(int j = 0; j < accounts[i].length;j++){
                    sum+=accounts[i][j];
            }
            if(sum >max){
                max=sum;
            }
           
        }
      
        return max;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the row");
        System.out.println("enter the col");
       int  row = in.nextInt();
       int  col = in.nextInt();
        int[][] n = new int[row][col];
        for(int i = 0; i < row;i++){
            for(int j=0; j <col;j++){
            n [i][j] = in.nextInt();
        }
        }
        Solution obj = new Solution();
        int  result = obj.maximumWealth(n);
        System.out.println(row  + "customer has wealth" +  result);
   }

}