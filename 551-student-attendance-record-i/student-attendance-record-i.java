class Solution {
    public boolean checkRecord(String s){
     Map<Character,Integer> seen = new HashMap<>();
        
        char[] chars = s.toCharArray();
        int count =0;
        for(char c : chars)
        if(c=='A'){
            count++;
        }
        
        if (count >= 2) {
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