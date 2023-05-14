import java.util.Arrays;

public class MaxTriple{
   public static void main(String[] args){
     // https://codingbat.com/prob/p190968
      int[] nums = {1, 2, 3};
      int ans = maxTriple(nums);
      System.out.println(ans);
   }
   
   public static int maxTriple(int[] nums) {
     int mid = nums.length / 2;
  
     int first = Math.max(nums[0], nums[mid]);
     return Math.max(first, nums[nums.length-1]);
}

}
