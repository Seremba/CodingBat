public class SeeColor{

   public static void main(String[] args){
       // https://codingbat.com/prob/p199216
       String ans = seeColor("redxx");
       
       System.out.println(ans);
      
   }
   
   public static String seeColor(String str) {
       if(str.startsWith("red")){
            return "red";
       } else if(str.startsWith("blue")) {
           return "blue";
       } else {
          return "";
       }
  }
}
