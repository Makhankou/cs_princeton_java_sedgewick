/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

public class RollLoadedDie {
    public static void main(String[] args) {
        int roll = (int) (Math.random() * 10) + 1;
        int result;
        if (roll <= 5) {
            result = roll;
        }
        else {
            result = 6;
        }
        System.out.println(result);
    }
}
