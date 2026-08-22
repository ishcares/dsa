class Solution {
    public int searchInsert(int[] nums, int target) {
         int j=0;
        for(int i = 0; i<nums.length;i++){
           
            if(nums[i]==target){
             j=i;
            }
            else if(target>nums[i]){
                j=i+1;
            }
        }
        return j;
    }

}