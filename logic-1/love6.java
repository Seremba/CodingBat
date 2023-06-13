public class love6 {
   public static void main(String[] args) {
    // https://codingbat.com/prob/p137742
   }

  public static boolean love6(int a, int b) {
   if (a == 6 || b == 6) {
     return true;
   }
   
   int sum = a + b;
   int diff = Math.abs(a -b);
   if(sum == 6 || diff == 6){
     return true;
   }
   
   return false;
}


}
