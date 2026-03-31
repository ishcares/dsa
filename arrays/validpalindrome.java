import java.util.*;
class Solution {
    public boolean isPalindrome(String s) {
      
       String ans =  s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int left = 0;
        int right = ans.length() -1;
        while(left<right){
            if(ans.charAt(left)!=ans.charAt(right)){
              return false;
            }
            left++;
            right--;


        }
        return true;

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter a string");
        String s = in.nextLine();
        Solution obj = new Solution();
        boolean ans = obj.isPalindrome( s);
        System.out.println("the string is" + ans);
}
}