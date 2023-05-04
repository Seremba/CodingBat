public class WithouEnd2{

   public static void main(String[] args){
       // https://codingbat.com/prob/p174254
       String ans = withouEnd2("Hello");
       
       System.out.println(ans);
      
   }
   
   public static String withouEnd2(String str) {
      if(str.length() < 2) return "";
      return str.substring(1, str.length()-1);
  }
}
