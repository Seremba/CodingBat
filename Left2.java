public class Left2{

   public static void main(String[] args){
       // https://codingbat.com/prob/p197720
       String ans = left2("Hello");
       
       System.out.println(ans);
      
   }
   
   public static String left2(String str) {
     if(str.length() < 2) return str;
     String firstTwo = str.substring(0,2);
     String rest = str.substring(2, str.length());
  
     return rest + firstTwo;
   }

}
