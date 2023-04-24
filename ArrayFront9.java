public class ArrayFront9 {
    public static void main(String[] args) {
        //https://codingbat.com/prob/p186031
    	int[] nums = {1, 9, 9, 3, 9};
        boolean ans = arrayFront9(nums);
        System.out.println(ans);
    }

   public static boolean arrayFront9(int[] nums) {
     int end = nums.length;
     if(end > 4) {
        end = 4;
     }
     
     for(int i = 0; i < end; i++){
       if( nums[i] == 9){
        return true;
       }
     }
   
    return false;
  }
}
