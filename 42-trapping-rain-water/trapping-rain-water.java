class Solution {
    public int trap(int[] height) {
       int left =0;
       int right = height.length-1;
       int max = height[left];
       int rightmax = height[right ];
       int sum =0;

       while(left<right){
       
        if(max<rightmax){
            left++;
            max = Math.max(max,height[left]);
            sum+= max- height[left];
           
            }
        else{
            right--;
            rightmax = Math.max(rightmax,height[right]);
            sum+= rightmax - height[right];
            }
           
            
        }
         return sum;
       }
   
      
    }
