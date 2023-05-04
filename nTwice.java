public class nTwice{

   public static void main(String[] args){
       // https://codingbat.com/prob/p174148
       String ans = nTwice("Chocolate", 3);
       
       System.out.println(ans);
      
   }
   
   public static String nTwice(String str, int n) {
  
     return str.substring(0,n) + str.substring(str.length()- n, str.length());
 }

}
