// https://codingbat.com/prob/p141736
public boolean equalIsNot(String str) {
  int is = 0;
  int not = 0;
  for (int i = 0; i < str.length(); i++) {
    if (str.startsWith("is", i)) {
      is++;
    } else if (str.startsWith("not", i)) {
      not++;
    }
  }
  return is == not;
}
