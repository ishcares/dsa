class Solution {
    public boolean check(int[] nums) {
        int n = nums.length;
        int k = 0;
         for(int i = 0; i<n-1 ; i++){
           
                if(nums[i]>nums[i+1]){
                    k++;
                    
                }
             
            }
             if (nums[n-1]>nums[0])
                {
                k++;
                }
    
         
         if(k<=1){
                return true;
            }
            else  
            
                return false;
                
    }   
    
      public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the size");
            System.out.println("enter the target");
       int  size = in.nextInt();
            
        int[] p = new int[size];
        for(int i = 0; i < size;i++){
            p [i] = in.nextInt();
        }
        Solution obj = new Solution();
       boolean  ans = obj.check(p);
        System.out.println("the array is " +  ans );
    }   
}