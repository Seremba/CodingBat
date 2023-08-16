public class SpecialEleven {
   public static void main(String[] args) {
    // https://codingbat.com/prob/p100962
   }

   public static boolean specialEleven(int n) {
  
  if(n % 11 == 0 || n % 11 == 1) {
    return true;
  }
  return false;
}

}
