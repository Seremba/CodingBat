// https://codingbat.com/prob/p109637
public String repeatSeparator(String word, String sep, int count) {
  String output = word;
  if (count == 0) return ""; 
  for (int i = 1; i < count; i++) {
    output += sep + word;
  }
  
    return output;
}
