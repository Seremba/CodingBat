public class without2{

   public static void main(String[] args){
       // https://codingbat.com/prob/p142247
       String ans = without2("HelloHe");
       
       System.out.println(ans);
      
   }
   
   public static String without2(String str) {
     if(str.length() > 1 && str.substring(0,2).equals(str.substring(str.length()-2, str.length()))) {
        return str.substring(2, str.length());
     } else {
        return str;
     }  
  }

}
