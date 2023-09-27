// https://codingbat.com/prob/p125185
public String mixString(String a, String b) {
    int max = Math.max(a.length(), b.length());
    String result = "";
    
    for (int i = 0; i < max; i++) {
        if (i <= a.length() - 1) {
        result += a.substring(i, i+1);
        }
        
        if (i <= b.length() - 1) {
        result += b.substring(i, i+1);
        }
    }
    
    return result;
}
