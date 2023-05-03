public class FirstTwo{

   public static void main(String[] args){
       // https://codingbat.com/prob/p184030
       String ans = firstTwo("Hello");
       
       System.out.println(ans);
      
   }
   
   public static String firstTwo(String str) {
      if(str.length() < 2) return str;
  
      return str.substring(0,2);
   }
}
