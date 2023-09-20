public class CloseFar {
    // https://codingbat.com/prob/p138990
public boolean closeFar(int a, int b, int c) {
   int diffAB = Math.abs(a - b);
   int diffBC = Math.abs(b - c);
   int diffAC = Math.abs(a - c);
   
   if(diffAB <= 1 && diffBC >= 2 && diffAC >= 2
      || diffAC <= 1 && diffBC >= 2 && diffAB >= 2){
     return true;
   }
  return false;
}

}