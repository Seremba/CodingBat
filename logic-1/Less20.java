public class Less20 {
   public static void main(String[] args) {
    // https://codingbat.com/prob/p133158
   }

   public static boolean less20(int n) {
    if ((n + 1) % 20 == 0 || (n + 2) % 20 == 0) {
      return true;
    }
     return false;
}

}
