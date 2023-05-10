import java.util.Arrays;
public class CommonEnd{
   public static void main(String[] args){
      // https://codingbat.com/prob/p191991
      int[] nums1 = {1,2,3};
      int[] nums2 = {7,3};
      boolean ans = commonEnd(nums1, nums2);
      System.out.println(ans);
   }
   
   public static boolean commonEnd(int[] a, int[] b) {
      if((a.length >= 1 || b.length >=1) && (a[0] == b[0] || a[a.length-1] == b[b.length-1])) {
           return true;
   }
  
    return false;
  }
}
