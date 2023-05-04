public class Right2{

   public static void main(String[] args){
       // https://codingbat.com/prob/p130781
       String ans = right2("Hello");
       
       System.out.println(ans);
      
   }
   
   public static String right2(String str) {
    if(str.length() < 2) return str;
    String lastTwo = str.substring(str.length() -2, str.length());
    String string = str.substring(0, str.length()-2);
  
    return lastTwo + string;
}


}
