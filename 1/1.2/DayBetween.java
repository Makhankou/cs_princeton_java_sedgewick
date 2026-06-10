/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

import java.util.Scanner;

public class DayBetween {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the day ");
        int d = scanner.nextInt();
        System.out.println("Enter the month ");
        int m = scanner.nextInt();
        boolean isSpring;
        isSpring = (m == 3 && d >= 20 && d <= 31) || (m == 4 && d >= 1 && d <= 30) || (m == 5
                && d >= 1 && d <= 31) || (m == 6 && d >= 1 && d <= 20);
        System.out.println(isSpring);
        scanner.close();
    }
}
