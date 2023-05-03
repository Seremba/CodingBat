public class ComboString{

   public static void main(String[] args){
       // https://codingbat.com/prob/p168564
       String ans = comboString("Hello", "hi");
       
       System.out.println(ans);
      
   }
   
   public static String comboString(String a, String b) {
       String s = "";
       if(a.length() < b.length()) {
          s = a + b + a;
       } else if(b.length() < a.length()) {
          s= b + a + b;
       }
     return s; 
 }

}
