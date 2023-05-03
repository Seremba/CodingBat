public class NonStart{

   public static void main(String[] args){
       // https://codingbat.com/prob/p143825
       String ans = nonStart("Hello", "There");
       
       System.out.println(ans);
      
   }
   
   public static String nonStart(String a, String b) {
     String c = a.substring(1, a.length());
     String d = b.substring(1,b.length());
   
     return c + d;
   }

}
