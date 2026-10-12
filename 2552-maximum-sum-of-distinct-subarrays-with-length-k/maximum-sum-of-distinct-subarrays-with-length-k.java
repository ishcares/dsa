class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        if(nums == null || nums.length == 0  || k<=0||k>nums.length){
            return -1;
        }
        HashMap<Integer,Integer> freq = new HashMap<>();
        long windowsum = 0;
        long maxsum = 0;
        for(int i =0; i<nums.length;i++){
            windowsum += nums[i];
            freq.put(nums[i],freq.getOrDefault(nums[i],0)+1);
        
        if(i>=k){
            windowsum -= nums[i-k];
           int outgoing = nums[i - k];
           if (freq.get(outgoing) == 1) {
            freq.remove(outgoing);
            } else {
      freq.put(outgoing, freq.get(outgoing) - 1);
         }
        }
        if(freq.size()==k){
            maxsum = Math.max(maxsum,windowsum);
        }
        }
        return maxsum;
    }
}