
public int countYZ(String str) {
  int count = 0;
  String string = str.toLowerCase();
  
  for (int i = 0; i < string.length(); i++) {
    if (!Character.isLetter(string.charAt(i))) {
      if (i > 0 && (string.charAt(i - 1) == 'y' || string.charAt(i - 1) == 'z')) {
        count++;
      }
    }
  }
  
  if (string.charAt(string.length() - 1) == 'y' || string.charAt(string.length() - 1) == 'z') {
    count++;
  }
  
  return count++;
}
