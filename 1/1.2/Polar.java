/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

import java.util.Scanner;

public class Polar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the x coordinate ");
        double x = scanner.nextDouble();
        System.out.println("Enter the y coordinate ");
        double y = scanner.nextDouble();
        double r = Math.sqrt(x * x + y * y);
        double theta = Math.toDegrees(Math.atan2(y, x));
        System.out.println("The polar coordinates are: r = " + r + ", theta = " + theta);
    }
}
