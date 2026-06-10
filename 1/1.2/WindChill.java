/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

import java.util.Scanner;

public class WindChill {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the temperature: ");
        double temperature = scanner.nextDouble();
        System.out.println("Please enter the wind speed: ");
        double velocity = scanner.nextDouble();

        double windChill = 35.74 + 0.6215 * temperature + (0.4275 * temperature - 35.75) * Math.pow(
                velocity, 0.16);

        System.out.println("Wind chill is " + windChill);
        scanner.close();
    }
}
