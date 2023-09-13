public class InOrderEqual {
    // https://codingbat.com/prob/p140272
public boolean inOrderEqual(int a, int b, int c, boolean equalOk) {
    if (equalOk) {
        if(c >= b && b >= a) {
        return true;
        }
    } else {
        if(c > b && b > a) {
        return true;
        } 
    }
    
    return false;
}
}