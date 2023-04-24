public class ArrayCount9 {
    public static void main(String[] args) {
    //https://codingbat.com/prob/p184031
    	int[] nums = {1, 9, 9, 3, 9};
        int ans = arrayCount9(nums);
        System.out.println(ans);
    }

   public static int arrayCount9(int[] nums) {
      int count = 0;
      for(int i = 0; i < nums.length; i++) {
        if(nums[i] == 9) {
          count++;
       }
     }
   
     return count;
   }

}
