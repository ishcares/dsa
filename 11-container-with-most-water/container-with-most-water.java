class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length-1;
        int max = Integer.MIN_VALUE;
          int width ;
          int area;
          int h;
        while(left<right){
            {
          width = right-left;
          h = Math.min(height[left],height[right]);
          area= h*width;
            }
        if(height[left]>height[right]){
           right--;
        }
        else{
          left++;
        }
       
      
        max = Math.max(area,max);
        }
      
       return max; 
    }
}