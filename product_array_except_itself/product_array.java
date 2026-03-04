package product_array_except_itself;

import java.util.Arrays;
import java.util.Scanner;

public class product_array {

    public static int[] productExceptSelf(int[] nums){
          int pre =1;
          int post =1;

           int n = nums.length;
           int[] result = new int[n];
           Arrays.fill(result,1);

           for(int i=0;i<n;i++){
              result[i] = pre;
              pre = pre*nums[i];
           }

           for(int i=n-1;i>=0;i--){
             result[i] = result[i]*post;
             post = post*nums[i];
           }

           return result;


    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the size of the array");
        int n = input.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter the elements "+ n +" of the array");
       for(int i=0;i<n;i++){
         nums[i] = input.nextInt();
       }

       int[] result = productExceptSelf(nums);

       for(int num:result){
        System.out.print(num+" ");
       }

    }
}
