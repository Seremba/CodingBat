// https://codingbat.com/prob/p136585
public int centeredAverage(int[] nums) {

  int largest = nums[0];
  int smallest = nums[0];
  
  int sum = 0;
  
  for (int i = 0; i < nums.length; i++) {
    sum += nums[i];
    smallest = Math.min(smallest, nums[i]);
    largest = Math.max(largest, nums[i]);
  }
  sum = sum - largest - smallest;
  sum = sum / (nums.length - 2);
  return sum;
}
