class Solution {
    public int[] rotate(int[] nums, int k) {
     
      int n = nums.length;
       int[] temp = new int[k];
        k = k % n;
      for(int i=n-k;i<n;i++){
       temp[i-(n-k)]=nums[i];
      }
      for( int i=n-1;i>=k; i--){
        nums[i]=nums[i-k];
            
        }
        int j = 0;
        for(int i = 0 ; i<k;i++){
            nums[i] = temp [j];
            j++;
        }
        return nums;
      }
      
}