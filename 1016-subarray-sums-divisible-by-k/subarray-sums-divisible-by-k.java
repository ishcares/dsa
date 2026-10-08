class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer,Integer> freq = new HashMap<>();
        freq.put(0,1);
         int prefixsum =0;
         int count =0;
        for(int i = 0; i<nums.length;i++){
            prefixsum += nums[i];
         int remainder =((prefixsum % k)+k)%k;
         count += freq.getOrDefault(remainder,0);
         freq.put(remainder,freq.getOrDefault(remainder,0)+1);
        }
        return count;
    }
}