import java.util.Arrays;

public class Double23{
   public static void main(String[] args){
     // https://codingbat.com/prob/p145365
      int[] nums = {2, 3};
      boolean ans = double23(nums);
      System.out.println(ans);
   }
   
   public static boolean double23(int[] nums) {
    if(nums.length >1 && nums[0] == 2 && nums[1] == 2) return true;
    if(nums.length >1 && nums[0] == 3 && nums[1] == 3) return true;
    return false;
   }
}
