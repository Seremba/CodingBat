import java.util.Arrays;
public class MakeLast{
   public static void main(String[] args){
      // https://codingbat.com/prob/p175689
      int[] nums1 = {4, 5, 6};

      int[] ans = makeLast(nums1);
      System.out.println(Arrays.toString(ans));
   }
   
   public static int[] makeLast(int[] nums) {
     int[] arr = new int[nums.length*2];
  
     arr[arr.length-1 ] = nums[nums.length-1];
     return arr;
}
}
