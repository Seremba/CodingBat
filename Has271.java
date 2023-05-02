public class Has271{
  
  public static void main(String[] args){
    //https://codingbat.com/prob/p167430
    int[] nums = {1, 2, 7, 1};
    boolean ans = has271(nums);
    System.out.println(ans);
  }
  
  public static boolean has271(int[] nums) {
   
     for(int i = 0; i < nums.length-2;i++) {
       int val = nums[i];
       if(nums[i+1] == (val + 5) &&
       Math.abs(nums[i+2] - (val-1)) <= 2) {  // the "1" check
          return true;
      }
      
     }
   
  return false;
}


  
}
