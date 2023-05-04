public class TheEnd{

   public static void main(String[] args){
       // https://codingbat.com/prob/p162477
       String ans = theEnd("Hello", true);
       
       System.out.println(ans);
      
   }
   
   public static String theEnd(String str, boolean front) {
     if(front) {
       return str.substring(0,1);
     } else {
       return str.substring(str.length()-1, str.length());
     }
  }

}
