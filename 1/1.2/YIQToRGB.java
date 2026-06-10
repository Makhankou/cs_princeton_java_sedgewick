/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

import java.util.Scanner;

public class YIQToRGB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter Y: ");
        double y = scanner.nextDouble();
        System.out.println("Please enter I: ");
        double i = scanner.nextDouble();
        System.out.println("Please enter Q: ");
        double q = scanner.nextDouble();
        double r = (1 * y + 0.956 * i + 0.619 * q) * 255;
        double g = (1 * y - 0.272 * i - 0.647 * q) * 255;
        double b = (1 * y - 1.106 * i + 1.703 * q) * 255;
        System.out.println("R = " + r + ", G = " + g + ", B = " + b);
        scanner.close();
    }
}
