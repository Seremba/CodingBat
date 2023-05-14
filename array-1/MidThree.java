import java.util.Arrays;

public class MidThree{
   public static void main(String[] args){
     // https://codingbat.com/prob/p155713
      int[] nums = {1, 2, 3, 4, 5};
 
      int[] ans = midThree(nums);
      System.out.println(Arrays.toString(ans));
   }
   
   public static int[] midThree(int[] nums) {
     int mid = Math.round(nums.length/2);
     int[] arr = new int[3];
     arr[0] = nums[mid - 1];
     arr[1] = nums[mid];
     arr[2] = nums[mid+1];
  
     return arr;
  }

}
