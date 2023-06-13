public class caughtSpeeding {
   public static void main(String[] args) {
    // https://codingbat.com/prob/p157733
   }

   public static int caughtSpeeding(int speed, boolean isBirthday) {
     int temp = isBirthday ? 5 : 0;
  
    if(speed >= 81+temp) {
       return 2;
    } else if(speed <= 60+temp){
      return 0;
   } 
  
  return 1;
}

}
