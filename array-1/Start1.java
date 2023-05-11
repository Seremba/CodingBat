import java.util.Arrays;

public class Start1{
   public static void main(String[] args){
     // https://codingbat.com/prob/p190968
      int[] nums = {1, 2, 3};
      int[] arr = {1, 3};
      int ans = start1(nums, arr);
      System.out.println(ans);
   }
   
   public static int start1(int[] a, int[] b) {
      int count = 0;
      if(a.length > 0 && a[0] == 1){
        count++;
      }
  
      if(b.length > 0 && b[0] == 1){
       count++;
     }
  
     return count;
  }

}
