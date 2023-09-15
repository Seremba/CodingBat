public class SumLimit {
    //https://codingbat.com/prob/p118077
    public int sumLimit(int a, int b) {
        String str = String.valueOf(a+b);
        String strA = String.valueOf(a);
        
        if (str.length() == strA.length()) {
            return a + b;
        }
        return a;
    }

}