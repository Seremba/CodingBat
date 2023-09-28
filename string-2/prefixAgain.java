// https://codingbat.com/prob/p136417
public boolean prefixAgain(String str, int n) {
  String prefix = str.substring(0, n);
  int length = str.length();

  for (int i = n; i <= length - n; i++) {
    if (prefix.equals(str.substring(i, i+n))) {
      return true;
    }
  }
  return false;
}
