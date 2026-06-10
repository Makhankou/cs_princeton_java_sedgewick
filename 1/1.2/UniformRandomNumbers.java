/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

public class UniformRandomNumbers {
    public static void main(String[] args) {
        double x = Math.random();
        double y = Math.random();
        double z = Math.random();
        double a = Math.random();
        double b = Math.random();
        double average = (x + y + z + a + b) / 5.0;
        double minimum = Math.min(x, Math.min(y, Math.min(z, Math.min(a, b))));
        double maximum = Math.max(x, Math.max(y, Math.max(z, Math.max(a, b))));
        System.out.println(
                "Uniform random numbers are " + x + " " + y + " " + z + " " + a + " " + b);
        System.out.println("Their average value is " + average);
        System.out.println("Their minimum value is " + minimum);
        System.out.println("Their maximum value is " + maximum);
    }
}
