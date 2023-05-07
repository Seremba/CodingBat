public class atFirst{

   public static void main(String[] args){
       // https://codingbat.com/prob/p139076
       String ans = atFirst("hello");
       
       System.out.println(ans);
      
   }
   
   public static String atFirst(String str) {
      if(str.length() >= 2) {
         return str.substring(0,2);
      } else if(str.length() == 1) {
         return str.substring(0,1) + "@";
      } else {
         return "@@";
     }
}
}
