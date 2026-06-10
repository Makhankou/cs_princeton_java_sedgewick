/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

import java.util.Scanner;

public class GreatCircle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the latitude of the first point");
        double latitude1 = Math.toRadians(scanner.nextDouble());
        System.out.println("Enter the longtitude of the first point");
        double longtitude1 = Math.toRadians(scanner.nextDouble());
        System.out.println("Enter the latitude of the second point");
        double latitude2 = Math.toRadians(scanner.nextDouble());
        System.out.println("Enter the longtitude of the second point");
        double longtitude2 = Math.toRadians(scanner.nextDouble());
        double d = 60.0 * Math.toDegrees(Math.acos(
                Math.sin(latitude1) * Math.sin(latitude2) + Math.cos(latitude1) * Math.cos(
                        latitude2) * Math.cos(longtitude1 - longtitude2)));
        System.out.println("The great-circle distance between two points are " + d);
        scanner.close();
    }
}
