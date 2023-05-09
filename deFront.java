public class deFront{

   public static void main(String[] args){
       // https://codingbat.com/prob/p110141
       String ans = deFront("Hello");
       
       System.out.println(ans);
      
   }
   
   public static String deFront(String str) {  
      String string = str.substring(2, str.length());
  
     if (str.charAt(1)=='b') string = "b" + string;
     if (str.charAt(0)=='a') string = "a" + string;
  
     return string;
  }

}
