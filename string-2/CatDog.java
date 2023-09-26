public class CatDog {
    // https://codingbat.com/prob/p111624
    public boolean catDog(String str) {
        int dog = 0;
        int cat = 0;
        for (int i = 0; i < str.length() - 2; i += 1) {
            if (str.substring(i, i+3).equals("dog")) {
            dog++;
            }
            
            if (str.substring(i, i+3).equals("cat")) {
            cat++;
            }
        }
        return cat == dog;
    }

}