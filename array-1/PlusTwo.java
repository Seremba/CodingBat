import java.util.Arrays;
public class PlusTwo{
   public static void main(String[] args){
      // https://codingbat.com/prob/p180840
      int[] nums = {1, 2};
      int[] arr = {3, 4};
      int[] ans = plusTwo(nums, arr);
      System.out.println(Arrays.toString(ans));
   }
   
   public static int[] plusTwo(int[] a, int[] b) {
     int[] arr = new int[4];
     arr[0] = a[0];
     arr[1] = a[1];
     arr[2] = b[0];
     arr[3] = b[1];
  
  return arr;
}

}
