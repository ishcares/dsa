package Searching;

import java.util.Arrays;
import java.util.Scanner;

public class linear {
     static int linearSearch(int[] arr,int target){
        if(arr.length == 0){
            return -1 ;
        }

        for(int i = 0; i < arr.length; i++){
            int  element =arr[i];

            if(element == target){
                return i;
            }
         
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("enter the size of array");
      
        int s = in.nextInt();
        int [] a = new int [s];
          System.out.println("enter the array element");
          for(int i = 0; i < a.length; i++){
           a[i]=in.nextInt();
           }
    System.out.println(Arrays.toString(a));
    System.out.println("enter the search value");
        int t = in.nextInt();
    int ans = linearSearch(a, t);
    System.out.println("element found at"+ans);
    
}
}
