public class StringYak {
  
  public static void main(String[] args){
  
    String ans = stringYak2("yakpak");
    System.out.println(ans);
  }
   
  public static String stringYak(String str) {
  String result = "";
  for(int i = 0; i < str.length(); i++) {
    if(i+2 < str.length() && str.charAt(i) == 'y' && str.charAt(i+2) == 'k') {
      i = i + 2;
    } else {
      result = result + str.charAt(i);
    }
  }
  return result;
  }
  
  public static String stringYak2(String str) {
     
     if(str.contains("yak")) {
       return str.replace("yak", "");
     }
     
     return str;
  }
}




