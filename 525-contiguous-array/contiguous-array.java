class Solution {
    public int findMaxLength(int[] nums) {
        int prefixsum =0;
        int max = 0;
        int length = 0;
        HashMap<Integer,Integer> sub = new HashMap<>();
        sub.put(0,-1);
        for(int i =0; i<nums.length;i++){
            if(nums[i]==1){
                prefixsum += 1;
            }
            else{
                prefixsum -= 1;
            }
            if(sub.containsKey(prefixsum)){
                length = i - sub.get(prefixsum);
                max = Math.max(max,length);
            }
            else{
            sub.put(prefixsum,i);
            }
        }
        return max;
    }
}