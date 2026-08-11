class Solution {
    public int[] topKFrequent(int[] nums, int k) 
    {     List<Integer>[] bucket = new List [nums.length+1];
          HashMap <Integer,Integer> map = new HashMap<>();
          for(int num :nums){
            map.put(num,map.getOrDefault(num,0)+1);
          }
          for(int key:map.keySet()){
            int index = map.get(key);
             if(bucket[index]==null){
                bucket[index]= new ArrayList<>();
             }
             bucket[index].add(key);
          }
          int pos = 0;
          int[] result = new int[k];
          for(int i = bucket.length-1;i>0;i--){
            if(bucket[i]!=null){
                for(int j = 0; j<bucket[i].size() && pos<k;j++){
                    result[pos] = bucket[i].get(j);
                    pos++;
                }
            }
          }
          return result;

        
    }
}