/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

public class BetweenZeroAndOne {
    public static void main(String[] args) {
        double x = Double.parseDouble(args[0]);
        double y = Double.parseDouble(args[1]);
        boolean result;
        if (x > 0 && x < 1 && y > 0 && y < 1) {
            result = true;
        }
        else {
            result = false;
        }
        System.out.println(result);
    }
}
