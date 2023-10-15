public boolean gHappy(String str) {
int length = str.length();
  str = "x" + str + "x";
  for (int index = 1; index <= length; index++) {
    if (str.charAt(index) == 'g' && str.charAt(index + 1) != 'g' && str.charAt(index - 1) != 'g') return false;
  }
  return true;
}

System.out.println(gHappy("xxggxx"));