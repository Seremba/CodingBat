public class FrontAgain{

   public static void main(String[] args){
       // https://codingbat.com/prob/p196652
       boolean ans = frontAgain("edited") ;
       
       System.out.println(ans);
      
   }
   
   public static boolean frontAgain(String str) {
      if(str.length() < 2) return false;
      if(str.substring(0,2).equals(str.substring(str.length()-2,str.length() ))){
         return true;
      }
      return false;
  }

}
