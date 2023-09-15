public class LessBy10 {
    // https://codingbat.com/prob/p179196
    public boolean lessBy10(int a, int b, int c) {
        // return Math.abs(a - b) >= 10 || Math.abs(a - c) >= 10 || Math.abs(b - c) >= 10;
        int max = Math.max(a, Math.max(b, c));
        int min = Math.min(a, Math.min(b, c));
        
        int diff = max - min;
        if (diff >= 10) {
            return true;
        }
        return false;
    }
}