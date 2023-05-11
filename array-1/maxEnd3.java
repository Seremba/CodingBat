import java.util.Arrays;

public class maxEnd3{
   public static void main(String[] args){
     // https://codingbat.com/prob/p146256
      int[] nums = {11, 9, 5};
      int[] ans = maxEnd3(nums);
      System.out.println(Arrays.toString(ans));
   }
   
   public static int[] maxEnd3(int[] nums) {
     int max = Math.max(nums[0], nums[2]);

     return new int[] { max, max, max };
  }
}
