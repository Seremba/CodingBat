public class CountHi {
    // https://codingbat.com/prob/p147448
    public int countHi(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.length() <= 1) return 0;
            if (str.charAt(i) == 'h' && str.charAt(i+1) == 'i') {
            count++;
            }
        }
        return count;
    }


}