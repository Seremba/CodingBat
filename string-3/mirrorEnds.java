public String mirrorEnds(String string) {
  int begin = 0;
  int end = string.length()-1;

  for(int i = 0;i < string.length(); i++){

    if(string.charAt(begin) == string.charAt(end)){
      begin = begin + 1;
      end = end - 1;
    }
    if(begin != string.length() -1 - end){
      break;
    }

  }
  return string.substring(0, begin);
}