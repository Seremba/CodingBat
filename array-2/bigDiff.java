// https://codingbat.com/prob/p196640
public int bigDiff(int[] nums) {
  if (nums.length <= 1) {
    return 0;
  }
  int largest = nums[0];
  int min = nums[0];
  for (int i = 1; i < nums.length; i++) {
   largest = Math.max(largest, nums[i]);
   min = Math.min(min, nums[i]);
  }
  
  return largest - min;
}
