class Solution {
    public int longestConsecutive(int[] nums) {
       if(nums==null||nums.length==0){
        return 0;
       }
       Set <Integer> numset = new HashSet<>();
        for(int num:nums){
            numset.add(num);
        }  
        int max =0;
        for(int num:numset){
        if (!numset.contains(num - 1)) {

            int count =1;
            int currentnum = num;
           
            while(numset.contains(currentnum+1)){
                  currentnum+=1;
                  count+=1;
            }
           max = Math.max(max, count);
        }
        }

           return max;
    }
 
}