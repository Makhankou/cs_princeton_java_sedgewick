/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

import java.util.Scanner;

public class MercatorProjection {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the longtitude of the point in the center of the map ");
        double centerLongtitude = scanner.nextDouble();
        System.out.println("Please enter the latitude ");
        double latitude = scanner.nextDouble();
        System.out.println("Please enter the longtitude ");
        double longtitude = scanner.nextDouble();

        double x = longtitude - centerLongtitude;
        double y = (1.0 / 2.0) * Math.log((1 + Math.sin(latitude)) / (1 - Math.sin(latitude)));

        System.out.println("The projection: x = " + x + ", y = " + y);
        scanner.close();
    }
}
