public class WithoutDoubles {
    // https://codingbat.com/prob/p115233
    public int withoutDoubles(int die1, int die2, boolean noDoubles) {
    
        if (noDoubles) {
        if (die1 == 6) {
            die1 = 1;
        } else if (die1 == die2) {
            die1 = die1 + 1;
        }
        }
        
        return die1 + die2;
    }

}