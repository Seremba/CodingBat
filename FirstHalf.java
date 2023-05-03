public class FirstHalf{

   public static void main(String[] args){
       // https://codingbat.com/prob/p172267
       String ans = firstHalf("WooHoo");
       
       System.out.println(ans);
      
   }
   
   public static String firstHalf(String str) {
        return str.substring(0, str.length() / 2);
   }

}
