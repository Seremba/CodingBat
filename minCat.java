public class minCat{

   public static void main(String[] args){
       // https://codingbat.com/prob/p105745
       String ans = minCat("Hello", "Hi");
       
       System.out.println(ans);
      
   }
   
   public static String minCat(String a, String b) {
  
      if(a.length() > b.length()){
         int diff = a.length() - b.length();
         return a.substring(diff, a.length()) + b;
      }
  
     if(a.length() < b.length()){
        int diff = b.length() - a.length();
        return a + b.substring(diff, b.length());
     }
    return a + b;
 }

}
