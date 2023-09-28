// https://codingbat.com/prob/p129952
public String getSandwich(String str) {
  int firstIndex = str.indexOf("bread");
  int secondIndex = str.lastIndexOf("bread");
  
  if (secondIndex != -1 && firstIndex != secondIndex) {
    return str.substring(firstIndex + 5, secondIndex);
  }
  return "";
}
