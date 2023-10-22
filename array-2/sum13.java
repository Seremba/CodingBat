// https://codingbat.com/prob/p127384
public int sum13(int[] nums) {
  if (nums.length == 0) return 0;
  int sum = 0;
  
  for (int i = 0; i < nums.length; i++) {
    if (nums[i] != 13) {
      sum += nums[i];
    } else if (nums[i] == 13 && i < nums.length - 1) {
      nums[i] = 0;
      nums[i + 1] = 0;
    }
  }
  return sum;
}
