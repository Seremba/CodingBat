public class NoTriples{
  
  public static void main(String[] args){
    //https://codingbat.com/prob/p170221
    int[] nums = {1, 1, 2, 2, 1};
    boolean ans = noTriples(nums);
    System.out.println(ans);
  }
  
  public static boolean noTriples(int[] nums) {
  
   for(int i = 0; i < nums.length - 2; i++){
   
      if(nums[i] == nums[i+1] && nums[i+1] == nums[i+2]){
         return false;
      }
   }
   return true;
  }

  
}
