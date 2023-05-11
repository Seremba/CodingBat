import java.util.Arrays;

public class BiggerTwo{
   public static void main(String[] args){
     // https://codingbat.com/prob/p120347
      int[] nums = {1, 2}; // 3, 4
      int[] arr = {3, 4};
      int[] ans = biggerTwo(nums, arr);
      System.out.println(Arrays.toString(ans));
   }
   
   public static int[] biggerTwo(int[] a, int[] b) {
      int aSum = a[0] + a[1];
      int bSum = b[0] + b[1];
  
      if(aSum > bSum){
        return a;
      }
  
      if(aSum < bSum){
       return b;
      }
  
      return a;
   }
}
