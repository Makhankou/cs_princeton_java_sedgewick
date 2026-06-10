/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

import java.util.Scanner;

public class WindChill2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the temperature: ");
        double temperature = scanner.nextDouble();
        System.out.println("Please enter the wind speed: ");
        double velocity = scanner.nextDouble();
        if (temperature > 50 || velocity <= 3) {
            System.out.println(
                    "The wind chill cannot be calculated, because the formula is only defined for air temperatures of 50°F or lower and wind speeds above 3 mph.");
        }
        else {
            double windChill = 35.74 + 0.6215 * temperature
                    + (0.4275 * temperature - 35.75) * Math.pow(
                    velocity, 0.16);

            System.out.println("Wind chill is " + windChill);
        }
        scanner.close();
    }
}
