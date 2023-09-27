// https://codingbat.com/prob/p134250
public boolean xyBalance(String str) {
  boolean isBalanced = false;
  
  for (int i = str.length() - 1; i >= 0; i--) {
    if (str.charAt(i) == 'y') {
      isBalanced = true;
    } else if (str.charAt(i) == 'x' && !isBalanced) {
      return false;
    }
  }
  return true;
}
