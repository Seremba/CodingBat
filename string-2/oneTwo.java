// https://codingbat.com/prob/p122943
public String oneTwo(String str) {
  String output = "";
  int length = str.length();
  for (int i = 0; i < length - 2; i += 3) {
       output += str.substring(i+1, i+3) + str.charAt(i);
    
  }
  
  return output;
}
