// https://codingbat.com/prob/p178353
public String[] fizzArray2(int n) {
  String[] newArray = new String[n];
  for (int i = 0; i < n; i++) {
    newArray[i] = String.valueOf(i);
  }
  return newArray;
}
