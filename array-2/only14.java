// https://codingbat.com/prob/p186672
public boolean only14(int[] nums) {
  boolean isOneOrFour = true;
  for (int i = 0; i < nums.length; i++) {
    if (nums[i] != 1 && nums[i] != 4) {
      isOneOrFour = false;
    }
  }
  return isOneOrFour;
}
