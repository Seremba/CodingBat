public class in1To10 {
   public static void main(String[] args) {
    // https://codingbat.com/prob/p137365
   }

 public static boolean in1To10(int n, boolean outsideMode) {
  if(!outsideMode){
    if(n >= 1 && n <= 10) {
      return true;
    }
  } else {
    if(n <= 1 || n >= 10) {
        return true;
      }
  }
  
  return false;
}

}
