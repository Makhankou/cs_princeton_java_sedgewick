/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

import java.util.Scanner;

public class OrderCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter x ");
        double x = scanner.nextDouble();
        System.out.println("Please enter y ");
        double y = scanner.nextDouble();
        System.out.println("Please enter z ");
        double z = scanner.nextDouble();
        boolean result = (x > y && y > z) || (x < y && y < z);
        System.out.println(result);
        scanner.close();
    }
}
