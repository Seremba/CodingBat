// https://codingbat.com/prob/p128796
public String repeatFront(String str, int n) {
  String word = "";
  while (n >= 0) {
    word += str.substring(0, n);
    n--;
  }
  
  return word;
}
