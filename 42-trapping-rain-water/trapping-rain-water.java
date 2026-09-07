class Solution {
    public int trap(int[] height) {
       int max = height[0];
       int rightmax = height[height.length-1 ];

       int left =0;
       int right = height.length-1;
       int sum =0;

       while(left<right){
       
            int waterlevel = Math.min(max,rightmax);
          
        if(height[left]<height[right]){
            if(height[left] >= max){
            max=height[left];
            }
            else{
            sum+=max - height[left];
           
            }
             left++;
           
        }
        else{
            if(height[right] >= rightmax){
                rightmax=height[right];
            }
            else{
            
            sum+= rightmax - height[right];
            }
            right--;
            
        }
       }
   
       return sum;
    }
}