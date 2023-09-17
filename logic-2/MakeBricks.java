public class MakeBricks {
    // https://codingbat.com/prob/p183562
    public boolean makeBricks(int small, int big, int goal) {
        // if (goal / 5 <= big){
        //   return (goal % 5 <= small);
        // } else {
        //   return (small >= (goal-big*5)); 
        // }
        return goal % 5 <= small && big * 5 + small >= goal;
    }


}