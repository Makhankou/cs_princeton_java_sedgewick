/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

import java.util.Scanner;

public class Interest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the amount of dollars invested ");
        double P = scanner.nextDouble();
        System.out.println("Enter the interest rate ");
        double r = scanner.nextDouble();
        System.out.println("Enter the years ");
        double t = scanner.nextDouble();

        double interest = P * Math.exp(r * t);

        System.out.println("Continuously compounded interest is " + interest);

        scanner.close();
    }
}
