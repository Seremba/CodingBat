public class startWord {
    public static void main(String[] args) {
        // https://codingbat.com/prob/p141494
    	
        String ans = startWord("hippo", "hi");
        System.out.println(ans);
    }

   public static String startWord(String str, String word) {
     
     if(str.length() > 0) {
        if (str.startsWith(word) || str.substring(1).startsWith(word.substring(1))) {
          return str.substring(0, word.length());
        }
     }  
   
     return "";
  }
}
