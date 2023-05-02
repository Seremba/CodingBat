public class MakeAbba{
  
  public static void main(String[] args){
    //https://codingbat.com/prob/p161056
    String ans = makeAbba("Bob", "Ngambeki");
    System.out.println(ans);
  }
  
  public static String makeAbba(String a, String b) {
   
  return a + b + b + a;
}

}
