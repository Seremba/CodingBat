public class TwoChar{

   public static void main(String[] args){
       // https://codingbat.com/prob/p144623
       String ans = twoChar("java", 0);
       
       System.out.println(ans);
      
   }
   
   public static String twoChar(String str, int index) {
      if(str.length() <= index+1 || index < 0){
          return str.substring(0,2);
       }
      return str.substring(index, index+2);
  }
}
