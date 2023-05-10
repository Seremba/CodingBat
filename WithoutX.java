public class WithoutX {
    public static void main(String[] args) {
        // https://codingbat.com/prob/p151940
    	
        String ans = withoutX("xHix");
        System.out.println(ans);
    }

   public static String withoutX(String str) {
     if(str.length() <=1) {
        return "";
    }
  
    if(str.charAt(0) == 'x') {
      str = str.substring(1, str.length());
    }
  
   if(str.charAt(str.length()-1) == 'x'){
     str = str.substring(0, str.length()-1);
   }
  
   return str;
 }
}
