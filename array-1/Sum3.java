import java.util.Arrays;
public class Sum3{
   public static void main(String[] args){
      // https://codingbat.com/prob/p175763
      int[] nums1 = {1,2,3};

      int ans = sum3(nums1);
      System.out.println(ans);
   }
   
   public static int sum3(int[] nums) {
       return nums[0] + nums[1] + nums[2];
   }
}
