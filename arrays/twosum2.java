class Solution {
    public int[] twoSum(int[] nums, int target) {
        
            int left = 0;
            int right = nums.length-1;

            while(left<right){
                if(nums[left]+nums[right]== target){
                    return new int []{left+1,right+1};
                }
                if(nums[left]+nums[right]> target){
                    right --;
                }
                else
                left++;
            }

     return new int[]{-1, -1};
    }
        public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the size");
            System.out.println("enter the target");
       int  size = in.nextInt();
            int t = in.nextInt();
        int[] n = new int[size];
        for(int i = 1; i < size;i++){
            n [i] = in.nextInt();
        }
        Solution obj = new Solution();
        int [] ans = obj.twoSum(n,t);
        System.out.println("the index of " + t +  " is " + ans );
                           }   
}
