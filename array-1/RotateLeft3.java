public class RotateLeft3{
   public static void main(String[] args){
     // https://codingbat.com/prob/p185139
      int[] nums = {11, 9, 5};
      boolean ans = rotateLeft3(nums);
      System.out.println(ans);
   }
   
   public static int[] rotateLeft3(int[] nums) {
     int[] arr = new int[3];
     arr[0] = nums[1];
     arr[1] = nums[2];
     arr[2] = nums[0];
  
    return arr;
}

}
