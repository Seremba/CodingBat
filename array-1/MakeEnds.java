import java.util.Arrays;

public class MakeEnds{
   public static void main(String[] args){
     // https://codingbat.com/prob/p101230
      int[] nums = {1, 2, 3};
      int[] ans = makeEnds(nums);
      System.out.println(Arrays.toString(ans));
   }
   
   public static int[] makeEnds(int[] nums) {
     return new int[]{nums[0], nums[nums.length-1]};
  }

}
