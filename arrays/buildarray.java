import java.util.*;
class Solution {
    public int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];
        for(int i = 0; i< nums.length;i++){
             ans[i] = nums[nums[i]];
        }
        return ans;
        
    }
     public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the size");
       int  size = in.nextInt();
        int[] n = new int[size];
        for(int i = 0; i < size;i++){
            n [i] = in.nextInt();
        }
        Solution obj = new Solution();
        int [] result = obj.buildArray(n);
        System.out.println(Arrays.toString(result));
}
   }
