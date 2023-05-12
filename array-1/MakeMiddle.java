import java.util.Arrays;
public class MakeMiddle{
   public static void main(String[] args){
      // https://codingbat.com/prob/p199519
      int[] nums = {1, 2, 3, 4};
      int[] ans = makeMiddle(nums);
      System.out.println(Arrays.toString(ans));
   }
   
   public static int[] makeMiddle(int[] nums) {
     int[] arr = new int[2];
     if(nums.length == 2) {
       arr[0] = nums[0];
       arr[1] = nums[1];
    }
    int mid =  nums.length / 2;
    arr[0] = nums[mid-1];
    arr[1] = nums[mid];
  
    return arr;
}

}
