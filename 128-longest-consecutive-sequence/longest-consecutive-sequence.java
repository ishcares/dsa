class Solution {
    public int longestConsecutive(int[] nums) {
       if(nums==null||nums.length==0){
        return 0;
       }
       Set<Integer> seen = new HashSet<>();
       for(int num:nums){
        seen.add(num);
       }
       
       int max= 0;
       for(int num :seen){
        if(!seen.contains(num-1)){
            int count =1;
            int current = num;

        while(seen.contains(current+1)){
            current+=1;
            count++;
        }
                max=Math.max(max,count);

        }
       }
       return max;
    }
    
 
}