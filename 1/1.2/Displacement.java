/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

import java.util.Scanner;

public class Displacement {
    public static void main(String[] args) {

        double g = 9.80665;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter x0 ");
        double x0 = scanner.nextDouble();
        System.out.println("Please enter v0 ");
        double v0 = scanner.nextDouble();
        System.out.println("Please enter t ");
        double t = scanner.nextDouble();

        double displacement = x0 + v0 * t - (g * t * t) / 2;

        System.out.println("The displacement is " + displacement);

        scanner.close();
    }
}
