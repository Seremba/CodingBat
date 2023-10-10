public String starOut(String str) {
  String output = "";
  for (int i = 0; i < str.length(); i++) {
    if (!(str.substring(Math.max(0, i-1), Math.min(str.length(), i+2)).contains("*"))) 
    output += str.charAt(i);
  }
  return output;
}