public class sortaSum {
   public static void main(String[] args) {
    // https://codingbat.com/prob/p183071
   }

   public static int sortaSum(int a, int b) {
    int sum = 0;
    sum = a + b;
	  
   if(sum >= 10 && sum <= 19) {
     sum = 20;
   }
    return sum;
}

}
