public class InOrder {
    // https://codingbat.com/prob/p154188
    public boolean inOrder(int a, int b, int c, boolean bOk) {
        if (bOk) {
            if(c > b) {
            return true;
            } else {
            return false;
            }
        }
        if(b > a && c > b) {
            return true;
        }
    
    
        return false;
    }
}