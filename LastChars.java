public class LastChars{

   public static void main(String[] args){
       // https://codingbat.com/prob/p138183
       String ans = lastChars("last", "chars");
       
       System.out.println(ans);
      
   }
   
   public static String lastChars(String a, String b) {
  
     if(a.length() == 0) {
         a = "@";
     } 
    if(b.length() == 0) {
         b = "@";
    } 
      return a.substring(0, 1) + b.substring(b.length()-1, b.length());
   }

}
