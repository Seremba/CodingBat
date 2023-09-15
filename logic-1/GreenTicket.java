public class GreenTicket {
    //https://codingbat.com/prob/p120633
        public int greenTicket(int a, int b, int c) {
            if (a == b && b == c && c == a) {
                return 20;
            } else if (a == b || b == c || c ==a) {
                return 10;
            }
            
            return 0;
    }
}