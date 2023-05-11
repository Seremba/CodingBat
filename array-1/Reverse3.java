import java.util.Arrays;

public class Reverse3{
   public static void main(String[] args){
     // https://codingbat.com/prob/p112409
      int[] nums = {11, 9, 5};
      int[] ans = reverse3(nums);
      System.out.println(Arrays.toString(ans));
   }
   
   public static int[] reverse3(int[] nums) {
  
     int[] arr = new int[3];
     arr[0] = nums[2];
     arr[1] = nums[1];
     arr[2] = nums[0];
    return arr;
}

}
