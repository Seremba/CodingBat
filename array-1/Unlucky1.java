import java.util.Arrays;

public class Unlucky1{
   public static void main(String[] args){
     // https://codingbat.com/prob/p197308
      int[] nums = {1, 3, 4, 5};
 
      boolean ans = unlucky1(nums);
      System.out.println(ans);
   }
   
   public static boolean unlucky1(int[] nums) {
     if(nums.length ==1 || nums.length == 0) {
         return false; 
     } else if(
         nums[0] == 1 && nums[1] == 3 || 
         nums[nums.length-2] == 1 && nums[nums.length-1] == 3 ||
         nums[1] == 1 && nums[2] == 3) {
         return true;
     } else {
        return false;
     }
  
   }
}
