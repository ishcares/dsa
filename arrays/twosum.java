import java.util.*;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        for(int i =0; i<nums.length;i++){
            for(int j = i+1; j< nums.length; j++)           {
                int sum = nums[i]+nums[j];
                
                if(target==sum){
                    
                    return new int[]{i, j};
                }
                
            }       
        }
            
        return new int[]{-1, -1};
    }
        public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the size");
            System.out.println("enter the target");
       int  size = in.nextInt();
            int t = in.nextInt();
        int[] n = new int[size];
        for(int i = 0; i < size;i++){
            n [i] = in.nextInt();
        }
        Solution obj = new Solution();
        int [] ans = obj.twoSum(n,t);
        System.out.println("the index of " + t +  " is " + ans );
                           }   
}