public class MakeOutWord{

   public static void main(String[] args){
       
       String ans = makeOutWord("<<>>", "Yay");
       
       System.out.println(ans);
      
   }
   
   public static String makeOutWord(String out, String word) {
       return out.substring(0,2) + word + out.substring(2,4);
   }
}
