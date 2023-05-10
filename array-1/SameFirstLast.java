public class SameFirstLast{
   public static void main(String[] args){
      // https://codingbat.com/prob/p118976
      int[] nums = {1, 2, 3, 1};
      boolean ans = sameFirstLast( nums);
      System.out.println(ans);
   }
   
   public static boolean sameFirstLast(int[] nums) {
     if(nums.length >= 1 &&(nums[0] == nums[nums.length-1])) {
        return true;
     }
  
     return false;
   }
}
