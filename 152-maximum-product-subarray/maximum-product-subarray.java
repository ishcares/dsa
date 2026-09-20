class Solution {
    public int maxProduct(int[] nums) {
        int max = nums[0];
        int newmax = nums[0];
        int newmin = nums[0];

        for (int i = 1; i < nums.length; i++) {

            int oldMax = newmax;
            int oldMin = newmin;

            newmax = Math.max(nums[i],
                    Math.max(oldMax * nums[i], oldMin * nums[i]));

            newmin = Math.min(nums[i],
                    Math.min(oldMax * nums[i], oldMin * nums[i]));

            max = Math.max(max, newmax);
        }

        return max;
    }
}