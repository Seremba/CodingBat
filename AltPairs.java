public class AltPairs {
   public static void main(String[] args) {
   
      String ans = altPairs("");
      System.out.println(ans);
   }

   public static String altPairs(String str) {
     String s1="";
     for(int i=0; i<str.length();i++){
       if(i%2==0) s1=s1+str.charAt(i);
       if(i%2!=0){
         s1=s1+str.charAt(i);
         i=i+2;
       }
     }
     return s1;
  }
}
