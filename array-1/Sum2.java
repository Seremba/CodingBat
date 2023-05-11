import java.util.Arrays;

public class Sum2{
   public static void main(String[] args){
     // https://codingbat.com/prob/p190968
      int[] nums = {11, 9, 5};
      int ans = sum2(nums);
      System.out.println(ans);
   }
   
   public static int sum2(int[] nums) {
    if(nums.length == 0) return 0;
    if(nums.length == 1) return nums[0];
  
    return nums[0] + nums[1];
}
}
