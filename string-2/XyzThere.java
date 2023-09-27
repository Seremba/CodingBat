public class XyzThere {
    // https://codingbat.com/prob/p136594
    public boolean xyzThere(String str) {
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.charAt(i) == '.') {
            i++;
            } else if (str.substring(i, i+3).equals("xyz")) {
            return true;
            }
        } 
        return false;
    }

}