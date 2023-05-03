public class WithoutEnd{

   public static void main(String[] args){
       // https://codingbat.com/prob/p130896
       String ans = withoutEnd("Hello");
       
       System.out.println(ans);
      
   }
   
   public static String withoutEnd(String str) {
     String first = str.substring(1, str.length()-1);
   
     return first;
  }

}
