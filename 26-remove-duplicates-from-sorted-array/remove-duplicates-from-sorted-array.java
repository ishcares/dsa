class Solution {
    public int removeDuplicates(int[] nums) {
        
        
         int k = 1;
         for(int i = 1; i<nums.length;i++){
            if(nums[i]!=nums[i-1])
            {  nums[k]=nums[i];
               k++;
            }
            else{
                if(nums.length == 0)
                return 0;
                
            }
           
        }
        return k;
        
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
       int  ans = obj.removeDuplicates(p);
        System.out.println("the duplicates is " +  ans );
    }   
    
}