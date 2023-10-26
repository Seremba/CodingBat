
public boolean either24(int[] nums) {
  boolean twoNextTwo = false;
  boolean fourNextFour = false;;
  for (int i = 0; i < nums.length -1; i++) {
    if (nums[i] == 2 && nums[i+1] == 2) {
      twoNextTwo = true;
    }
    
    if (nums[i] == 4 && nums[i+1] == 4) {
      fourNextFour = true;
    }
    
  }
  return fourNextFour != twoNextTwo;
}
