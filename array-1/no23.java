import java.util.Arrays;
public class no23{
   public static void main(String[] args){
      // https://codingbat.com/prob/p175689
      int[] nums1 = {2,5};

      boolean ans = no23(nums1);
      System.out.println(ans);
   }
   
   public static boolean no23(int[] nums) {
  
    if(nums[0] == 2 || nums[1] == 3) return false;
    if(nums[1] == 2 || nums[0] == 3) return false;
  
   return true;
 }
}
