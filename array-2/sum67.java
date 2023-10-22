// https://codingbat.com/prob/p111327
public int sum67(int[] nums) {
  int sum = 0;
  boolean addNum = true;

    for( int i = 0; i < nums.length; i++){
        if(addNum && nums[i] == 6 || !addNum && nums[i] == 7) {
            addNum = !addNum;
            continue;
        }

        if(addNum) {
            sum += nums[i];
        }
    }

    return sum;
}
