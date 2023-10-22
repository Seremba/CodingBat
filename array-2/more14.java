// https://codingbat.com/prob/p104627
public boolean more14(int[] nums) {
  int countOnes = 0;
  int countFours = 0;
  
  for (int i = 0; i < nums.length; i++) {
    if (nums[i] == 1) {
      countOnes++;
    } else if (nums[i] == 4) {
      countFours++;
    }
  }
  
  if (countOnes > countFours) {
    return true;
  }
  
  return false;
}
