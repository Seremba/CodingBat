import java.util.Arrays;
public class has23{
   public static void main(String[] args){
      // https://codingbat.com/prob/p171022
      int[] nums1 = {2,5};

      boolean ans = has23(nums1);
      System.out.println(ans);
   }
   
   public static boolean has23(int[] nums) {
  
    if(nums[0] == 2 || nums[1] == 3) return true;
    if(nums[1] == 2 || nums[0] == 3) return true;
  
  return false;
}

}
