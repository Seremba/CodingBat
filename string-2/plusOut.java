// https://codingbat.com/prob/p170829
public String plusOut(String str, String word) {
   String result = "";
   int i = 0;

   while (i < str.length()) {
      if (str.substring(i).startsWith(word)) {
         result = result + word;
         i = i + word.length();
      } else {
         result = result + "+";
         i++;
      }
   }
   return result;
}
