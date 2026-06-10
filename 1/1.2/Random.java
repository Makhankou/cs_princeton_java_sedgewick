/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

public class Random {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int range = b - a + 1;
        int randomInteger = (int) (Math.random() * range) + a;

        System.out.println("The random number is " + randomInteger);
    }
}
