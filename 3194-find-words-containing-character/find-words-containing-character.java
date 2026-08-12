class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> equal = new ArrayList<>();
        
        for(int i =0; i< words.length;i++){
            if(words[i].indexOf(x)!= -1){
                equal.add(i);
            }
        }
        return equal;
         
    }
}