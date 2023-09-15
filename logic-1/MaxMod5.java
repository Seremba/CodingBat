public class MaxMod5 {
    // https://codingbat.com/prob/p115384
    public int maxMod5(int a, int b) {
        int modA = a % 5;
        int modB = b % 5;
        
        if (a == b) {
            return 0;
        }
        
        if (modA == modB) {
            return Math.min(a, b);
        } 
        
        return Math.max(a, b);
    }

}