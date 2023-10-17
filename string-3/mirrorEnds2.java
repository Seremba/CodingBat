// https://codingbat.com/prob/p139411
public String mirrorEnds(String string) {
  String output = "";
  for (int i = 0; i < string.length(); i++) {
    if (string.charAt(i) == string.charAt(string.length() - 1 - i)) {
      output += string.charAt(i);
    } else {
      break;
    }
  }
  return output;
}
