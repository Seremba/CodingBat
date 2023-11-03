public int[] shiftLeft(int[] nums) {
  int temp = 0;
  for (int i = 0; i < nums.length - 1; i++) {
    temp = nums[i];
    nums[i] = nums[i+1];
    nums[i+1] = temp;
  }
  
  return nums;
}