public class LuckySum {
    // https://codingbat.com/prob/p130788
    public int luckySum(int a, int b, int c) {
        if (a == 13) {
            return 0;
        } else if (b == 13) {
            c = 0;
            return a;
        } else if (c == 13) {
            return a + b;
        }
        return a + b + c;
    }

}