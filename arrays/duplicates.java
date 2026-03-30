import java.util.*;
class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i = 1;i<nums.length;i++){
            if(nums[i]==nums[i-1]){
                return true ;
            }
        }
        return false;
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
        boolean ans = obj.containsDuplicate(p);
        System.out.println("the profit is " +  ans );
    }   
    

}