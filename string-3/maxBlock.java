// https://codingbat.com/prob/p179479
public int maxBlock(String str) {
  if (str.length() == 0) {
    return 0;
  }
  int current = 1;
  int largest = 0;
  for (int i = 1; i < str.length(); i++) {
    if (str.charAt(i) != str.charAt(i-1)) {
      if(current > largest) {
        largest = current;
      }
      current = 1;
    } else {
      current++;
    }
  }
  return Math.max(current, largest);
}
