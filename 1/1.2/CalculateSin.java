/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

import java.util.Scanner;

public class CalculateSin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter t: ");
        double t = scanner.nextDouble();
        double result = Math.sin(2 * t) + Math.sin(3 * t);
        System.out.println("sin(2t) + sin(3t) = " + result);
        scanner.close();
    }
}
