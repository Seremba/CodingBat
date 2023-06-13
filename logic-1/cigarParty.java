public class cigarParty {
   public static void main(String[] args) {
    // https://codingbat.com/prob/p159531
   }

   public static boolean cigarParty(int cigars, boolean isWeekend) {
      if(cigars >= 40 && cigars <= 60) {
         return true;
    }
    if(cigars >= 40 && isWeekend) {
       return true;
    }
    return false;
  }
}
