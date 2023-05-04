public class MiddleThree{

   public static void main(String[] args){
       // https://codingbat.com/prob/p115863
       String ans = middleThree("Candy");
       
       System.out.println(ans);
      
   }
   
   public static String middleThree(String str) {
       if(str.length() < 3) return str;
       int mid = str.length()/2;
     return str.substring(mid-1, mid+2);
   }
}
