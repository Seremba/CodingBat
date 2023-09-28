// https://codingbat.com/prob/p159772
public boolean xyzMiddle(String str) {
  if (str.indexOf("xyz") < 0) return false;
  int length = str.length();
  int mid = length / 2;
  if (length % 2 != 0) {
     if (!(str.substring((mid - 1), mid + 2).equals("xyz"))) 
     return false;
  }
  else {
    if (str.charAt(mid) != 'y' && str.charAt(mid - 1) != 'y') return false;
  }
  return true; 
}
