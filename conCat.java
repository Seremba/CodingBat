public class conCat{

   public static void main(String[] args){
       // https://codingbat.com/prob/p132118
       String ans = conCat("abc", "cat");
       
       System.out.println(ans);
      
   }
   
   public static String conCat(String a, String b) {

        if (a.length() == 0 || b.length() == 0) return a+b;

        if ((a.substring(a.length() - 1, a.length())).equals(b.substring(0,1))) {
            return a + b.substring(1,b.length());
  
        } else {
            return a+b;
        
        }
  }

}
