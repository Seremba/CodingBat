public class FirstLast6{
   public static void main(String[] args){
      int[] nums = {6, 1, 2, 3};
      boolean ans = firstLast6( nums);
      System.out.println(ans);
   }
   
   public static boolean firstLast6(int[] nums) {
    if(nums.length >=1 && (nums[0] == 6 || nums[nums.length-1] == 6)){
        return true;
    }
  
    return false;
}
}
