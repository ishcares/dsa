class Solution {
    public List<List<String>> groupAnagrams(String[] srs) {
      List<List<String>> result = new ArrayList<>();

        boolean[] visited = new boolean[srs.length];

        for(int i =0;i<srs.length;i++){
            if(visited[i]==true){
                continue;
            }

            List<String> currentgroup = new ArrayList<>();
            currentgroup.add(srs[i]);
            visited[i]=true;
            for(int j=i+1;j<srs.length;j++){
                if(visited[j]==true){
                continue;
            }
            if(isAnagram(srs[i],srs[j])){
                currentgroup.add(srs[j]);
                visited[j]= true;
            }
            

            }
        result.add(currentgroup);
        }
                    return result;

    }
        private boolean isAnagram(String s, String t) {
        int[] counts = new int[26];
        if(s.length()!=t.length()){
            return false;
        }

        for(int i = 0 ; i<s.length(); i++){
            counts[s.charAt(i)-'a']++;
            counts[t.charAt(i)-'a']--;
        }
        for(int count:counts){
         if(count!=0)
            return false;
        

        }
       
        return true;
        }
    
}