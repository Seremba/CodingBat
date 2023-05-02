public class Array667{
  
  public static void main(String[] args){
    //https://codingbat.com/prob/p110019
  }
  
  public static int array667(int[] nums) {
  int count1 = 0;
  int count2 = 0;
  
  for(int i = 0; i < nums.length - 1; i++) {
    if(nums[i] == 6 && nums[i+1] == 6) {
      count1++;
    }
    if(nums[i] == 6 && nums[i+1] == 7) {
      count2++;
    }
  }
  
  return count1 + count2;
}

 public static int array667Two(int[] nums) {
  int count = 0;
  
  
  for(int i = 0; i < nums.length - 1; i++) {
    if(nums[i] == 6){
       if(nums[i+1] == 6 || nums[i+1] == 7) {
          count++;
       }
    }
  }
  
    return count;
  }
}
