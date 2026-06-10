/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

public class Quadratic {
    public static void main(String[] args) {
        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);
        double c = Double.parseDouble(args[2]);
        double discriminant = b * b - 4.0 * a * c;
        if (discriminant < 0) {
            System.out.println("The discriminant is negative. The equation has no real solution!");
        }
        else {
            double d = Math.sqrt(discriminant);
            if (discriminant == 0) {
                System.out.println((-b) / 2.0 * a);
            }
            else {
                System.out.println((-b + d) / 2.0 * a);
                System.out.println((-b - d) / 2.0 * a);
            }
        }
    }
}
