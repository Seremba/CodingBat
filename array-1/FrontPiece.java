import java.util.Arrays;

public class FrontPiece{
   public static void main(String[] args){
     // https://codingbat.com/prob/p142455
      int[] nums = {1, 2, 3};
 
      int[] ans = frontPiece(nums);
      System.out.println(Arrays.toString(ans));
   }
   
   public static int[] frontPiece(int[] nums) {
      if (nums.length == 1){
         return new int[] {nums[0]};
      } else if (nums.length == 0) {
         return new int[] {};
      } else {
        return new int[] {nums[0],nums[1]};
     }
  }
}
