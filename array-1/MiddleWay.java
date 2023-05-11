import java.util.Arrays;

public class MiddleWay{
   public static void main(String[] args){
     // https://codingbat.com/prob/p146449
      int[] nums = {1, 2, 3};
      int[] arr = {4, 5, 6};
      int[] ans = middleWay(nums, arr);
      System.out.println(Arrays.toString(ans));
   }
   
   public static int[] middleWay(int[] a, int[] b) {
    int aMid = a.length / 2;
    int bMid = b.length / 2;
  
    return new int[] {a[aMid], b[bMid]};
  }
}
