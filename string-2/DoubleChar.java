public class DoubleChar {
    // https://codingbat.com/prob/p165312
    public String doubleChar(String str) {
        String result = "";
        
        for (int i = 0; i <= str.length() -1; i++) {
            result += str.charAt(i);
            result += str.charAt(i);
        }
        return result;
    }

}