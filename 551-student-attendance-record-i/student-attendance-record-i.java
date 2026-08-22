class Solution {
    public boolean checkRecord(String s){
     Map<Character,Integer> seen = new HashMap<>();
        
        char[] chars = s.toCharArray();
        for(char c : chars){
        seen.put(c,seen.getOrDefault(c,0)+1);
        }
        if (seen.getOrDefault('A', 0) >= 2) {
            return false;
        }

        int consecutiveL = 0;
        for (char c : chars) {
            if (c == 'L') {
                consecutiveL++;
                if (consecutiveL >= 3) return false;
            } else {
                consecutiveL = 0;
            }
        }
        return true;
    }
}