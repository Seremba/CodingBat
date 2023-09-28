// https://codingbat.com/prob/p194491
public boolean sameStarChar(String str) {
  int length = str.length();
  for (int i = 1; i < length - 1; i++) {
    if (str.charAt(i) == '*' && str.charAt(i-1) != str.charAt(i+1)) {
      return false;
    }
  }
  return true;
}

