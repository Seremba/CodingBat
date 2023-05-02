public class MakeTags{
  
  public static void main(String[] args){
    //https://codingbat.com/prob/p147483
    String ans = makeTags("Bob", "Ngambeki");
    System.out.println(ans);
  }
  
  public static String makeTags(String tag, String word) {
    
    String result = "<" + tag + ">" + word + "</" + tag + ">";
  
    return result;
  
  }

}
