public class EndsLy{

   public static void main(String[] args){
       // https://codingbat.com/prob/p103895
       boolean ans = endsLy("oddly");
       
       System.out.println(ans);
      
   }
   
   public static boolean endsLy(String str) {
      if(str.length() < 2) return false;
      if(str.substring(str.length()-2, str.length()).equals("ly")) {
           return true;
     }
     return false;
   }
}
