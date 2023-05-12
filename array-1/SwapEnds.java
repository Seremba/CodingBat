import java.util.Arrays;
public class SwapEnds{
   public static void main(String[] args){
      // https://codingbat.com/prob/p118044
      int[] nums = {1, 2, 3, 4};
      int[] ans = swapEnds(nums);
      System.out.println(Arrays.toString(ans));
   }
   
   public static int[] swapEnds(int[] nums) {
      if(nums.length >=1) {
         int temp = nums[0];
         nums[0] = nums[nums.length-1];
         nums[nums.length-1] = temp;
     }
  
     return nums;
  }
}
