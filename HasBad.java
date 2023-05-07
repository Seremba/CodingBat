public class HasBad{

   public static void main(String[] args){
       // https://codingbat.com/prob/p139075
       boolean ans = hasBad("badxx");
       
       System.out.println(ans);
      
   }
   
   public static boolean hasBad(String str) {
       if(str.length() < 3) {
            return false;
       }
       if(str.substring(0,3).equals("bad")) {
            return true;
       } else if(str.length() > 3) {
            return str.substring(1,4).equals("bad");
       }
  
       return false;
}

}
