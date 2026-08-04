class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        if(strs == null||strs.length == 0)
        return new ArrayList<>();

       Map<String,List<String>> map = new HashMap<>();
       for(String s : strs){
       char[] chars = s.toCharArray();
       char[] freq = new char[26];
       for(char c : chars){
        freq[c-'a']++;
       }
       
       String key = new String (freq);
      map.computeIfAbsent(key, k-> new ArrayList<>()).add(s);
       }
        return new ArrayList<>(map.values());
    }
}