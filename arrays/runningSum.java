import java.util.*;
class Solution {
    public int[] runningSum(int[] nums) {
       int s = nums.length;
        int [] ans = new int[s];
         ans[0] =nums[0];
        for(int i=1;i<s;i++){
        ans[i]= ans[i-1]+nums[i];

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
        int [] result = obj.runningSum(n);
        System.out.println(Arrays.toString(result));
 }
}
        
    