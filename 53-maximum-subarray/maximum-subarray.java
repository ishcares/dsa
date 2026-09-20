class Solution {
    public int maxSubArray(int[] nums) {
       
         int max =nums[0];
          int currentsum =0;
       for(int i =0; i< nums.length;i++){
        currentsum = Math.max(nums[i],currentsum+nums[i]);
         max = Math.max(max,currentsum);
       }
       return max;
    }
    }
