class Solution {
    public double findMaxAverage(int[] nums, int k) {
     double Maxavg =0.0;
     double sum =0.0;
     int i =0;
     int j=0;
     Double maxavg =0.0;
        Double max =Double.NEGATIVE_INFINITY;
while(j<nums.length){
 
    sum = sum + nums[j];

    if(j-i+1<k){
        j++;
    }
    else if(j-i+1==k){
        max = Math.max(sum,max);
       
        sum  = sum- nums[i];
        i++;
        j++;
           maxavg = max /k;
    }
   
 
   
}
  return maxavg;
    }
    
   
    }
   