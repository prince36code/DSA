import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Two_sum {

    public static int[] twoSum(int[] nums, int target) {

    HashMap<Integer,Integer> mp = new HashMap<>();
    int n = nums.length;

    for(int i=0;i<n;i++){
        int complement = target - nums[i];

        if(mp.containsKey(complement)){
            return new int[] {mp.get(complement),i};
        }
        mp.put(nums[i],i);
    }
    return new int[] {};
        
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
       ArrayList<Integer> nums = new ArrayList<>();
     System.out.println("Enter the number of elements of the array ");
      int n = input.nextInt();

      System.out.println("Enter the array elemennts");

      for(int i=0;i<n;i++){
        int num = input.nextInt();
        nums.add(num);
      }

      int target;
      System.out.println("Enter the target element");
      target = input.nextInt();

      int[] numsArray =  new int[n];

      for(int i=0;i<n;i++){
        numsArray[i] = nums.get(i);
      }

      int result[] = twoSum(numsArray,target);

      if(result.length == 0){
        System.out.println("No solution");
      }else{
        for(int i=0;i<result.length;i++){
            System.out.println(result[i]);
        }
    }
        
    }
}
