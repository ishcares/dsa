class Solution {
    public int characterReplacement(String s, int k) {
       int left = 0;
       int[] counts = new int[26];
       int max_freq = 0;
       int max = 1;

       for(int right = 0; right< s.length();right++){
        char c = s.charAt(right);
        counts[c-'A']++;
        max_freq = Math.max(max_freq,counts[c-'A']);
     while((right-left+1)-max_freq > k){
        char cl = s.charAt(left);
          counts[cl-'A']--;
          left++;
     }

     max = Math.max(max,right-left+1);

       }
       return max;
    }
}