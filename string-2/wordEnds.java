// https://codingbat.com/prob/p147538
public String wordEnds(String str, String word) {
  String result = "";
  int index = 0;
  int end = 0; 
  int length =str.length();
  
  while(index < length) {
    end = index + word.length();
    if (end > length) {
      end = length;
    }
    
    if(str.substring(index, end).equals(word)) {
      
      if(index > 0) {
        result = result + str.charAt(index - 1);
      }
      
      if(index + word.length() < length) {
        result = result + str.charAt(end);
      }
      
    }
    index++;
  }
  return result;
}
