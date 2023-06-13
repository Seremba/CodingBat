public class squirrelPlay {
   public static void main(String[] args) {
    // https://codingbat.com/prob/p141061
   }

   public static boolean squirrelPlay(int temp, boolean isSummer) {
	  if(temp >= 60 && temp <= 90){
	    return true;
	  }
	  
	  if(isSummer){
	    if(temp >= 60 && temp <= 100){
	      return true;
	    }
	  }
	  
	  return false;
	}

}
