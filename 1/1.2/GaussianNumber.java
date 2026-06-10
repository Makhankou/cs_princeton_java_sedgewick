/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

public class GaussianNumber {
    public static void main(String[] args) {
        double u = Math.random();
        double v = Math.random();
        double r = Math.sin(2 * Math.PI * v) * Math.sqrt(-2 * Math.log10(u));
        System.out.println("A random number from the Gaussian distribution is " + r);
    }
}
