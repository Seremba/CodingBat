// https://codingbat.com/prob/p100246
public int[] pre4(int[] nums) {
  int[] arr = new int[0];
  
  for (int i = nums.length -1; i >= 0; i--) {
    if (nums[i] == 4) {
      arr = new int[i];
    } else {
      if (arr.length > 0) {
        arr[i] = nums[i];
      }
    }
  }
  
  return arr;
}
