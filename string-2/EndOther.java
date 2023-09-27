public class EndOther {
    // https://codingbat.com/prob/p126880
    public boolean endOther(String a, String b) {
            String aLower = a.toLowerCase();
            String bLower = b.toLowerCase();
            for (int i = 0; i < a.length(); i++) {
                if (aLower.substring(i, aLower.length()).equals(bLower)) {
                return true;
                }
            }
            
            for (int i = 0; i < b.length(); i++) {
                if (bLower.substring(i, bLower.length()).equals(aLower)) {
                return true;
                }
            }
            return false; 
    }

}