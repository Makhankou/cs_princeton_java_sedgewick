/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

import java.util.Scanner;

public class RGBtoYIQ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter R");
        int r = scanner.nextInt();
        System.out.println("Please enter G");
        int g = scanner.nextInt();
        System.out.println("Please enter B");
        int b = scanner.nextInt();
        double y = (0.299 * r + 0.587 * g + 0.114 * b) / 255;
        double i = (0.596 * r - 0.275 * g - 0.321 * b) / 255;
        double q = (0.212 * r - 0.523 * g + 0.311 * b) / 255;
        System.out.println("y = " + y + ", i = " + i + ", q = " + q);
        scanner.close();
    }
}
