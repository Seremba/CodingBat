import java.util.Arrays;

public class Fix23{
   public static void main(String[] args){
     // https://codingbat.com/prob/p120347
      int[] nums = {1, 2, 3};
      int[] arr = {2, 3};
      int ans = fix23(nums, arr);
      System.out.println(Arrays.toString(ans));
   }
   
   public static int[] fix23(int[] nums) {
     if(nums[0] == 2 && nums[1] == 3) {
        nums[1] = 0;
     }
  
    if(nums[1] == 2 && nums[nums.length-1] == 3){
       nums[nums.length-1] = 0;
    }
  
    return new int[]{nums[0],nums[1], nums[2]};
  }

}
