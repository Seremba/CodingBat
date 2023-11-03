// https://codingbat.com/prob/p164144
public int[] post4(int[] nums) {
  int[] arr = new int[0];
  int j = 0;
  for (int i = 0; i < nums.length; i++) {
     if (nums[i] == 4) {
       arr = new int[nums.length - i - 1];
       j = 0;
     } else {
       if (arr.length > 0) {
         arr[j++] = nums[i];
       }
     }
  }
  
  return arr;
}
