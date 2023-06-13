public class dateFashion {
   public static void main(String[] args) {
    // https://codingbat.com/prob/p103360
   }

   public static int dateFashion(int you, int date) {
    if (you <= 2 || date <= 2) return 0;
    if (you <= 7 && date <= 7) return 1;
    return 2;
}

}
