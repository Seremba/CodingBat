public class lastTwo{

   public static void main(String[] args){
       // https://codingbat.com/prob/p174148
       String ans = lastTwo("coding");
       
       System.out.println(ans);
      
   }
   
   public static String lastTwo(String str) {
     if(str.length() < 2) {
         return str;
      }
   
      return str.substring(0, str.length()-2) + str.charAt(str.length()-1) +      str.charAt(str.length()-2);
   }

}
