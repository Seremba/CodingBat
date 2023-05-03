public class ExtraEnd{
   
   public static void main(String[] args){
       // https://codingbat.com/prob/p108853
       String ans = extraEnd("Hello");
       
       System.out.println(ans);
      
   }
   
   public static String extraEnd(String str) {
   
   String s = "";
   for(int i = 0; i <=2; i++) {
     s = s + str.charAt(str.length()-2) + str.charAt(str.length()-1);
   }
   return s;
}
}
