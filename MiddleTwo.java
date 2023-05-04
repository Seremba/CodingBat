public class MiddleTwo{

   public static void main(String[] args){
       // https://codingbat.com/prob/p174254
       String ans = middleTwo("string");
       
       System.out.println(ans);
      
   }
   
   public static String middleTwo(String str) {
      if(str.length() < 2) return str;
      int mid = str.length() / 2;
     return str.substring(mid-1, mid+1);
   }
}
