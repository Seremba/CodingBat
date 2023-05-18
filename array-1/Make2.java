import java.util.Arrays;

public class Make2{
   public static void main(String[] args){
     // https://codingbat.com/prob/p143461
      int[] a = {4, 5};
      int[] b = {1, 2, 3};
      int[] ans = make2(a, b);
      System.out.println(Arrays.toString(ans));
   }
   
   public static int[] make2(int[] a, int[] b) {
      if(a.length == 1) return new int[]{a[0],b[0]};
  
      if(a.length == 0) return new int[]{b[0], b[1]};
  
      return new int[]{a[0], a[1]};
}


}
