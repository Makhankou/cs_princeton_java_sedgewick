/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

import java.util.Scanner;

public class Gravitation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter mass one: ");
        double mass1 = scanner.nextDouble();
        System.out.println("Please enter mass two: ");
        double mass2 = scanner.nextDouble();
        System.out.println("Please enter the distance between two objects: ");
        double r = scanner.nextDouble();
        double G = 6.674e-11;

        double force = (G * mass1 * mass2) / (r * r);

        System.out.println("The gravitation force is " + force);
        scanner.close();
    }
}
