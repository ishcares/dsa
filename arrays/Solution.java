import java.util.*;
class Solution {
    public int[] getConcatenation(int[] nums) { int s = nums.length;
        int [] ans = new int[2*s];

        for(int i=0;i<s;i++){
        ans[i] = nums[i];
        ans[i + s] = nums[i];
        
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
        int [] result = obj.getConcatenation(n);
        System.out.println(Arrays.toString(result));
 }
}