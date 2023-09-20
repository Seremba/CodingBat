public class EvenlySpaced {
    // https://codingbat.com/prob/p198700
public boolean evenlySpaced(int a, int b, int c) {
  int[] sorted = {a, b, c};
  Arrays.sort(sorted);
  
  int diffFirst = sorted[0] - sorted[1];
  int diffSecond = sorted[1] - sorted[2];
  
  return diffFirst == diffSecond;
}


}