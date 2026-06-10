/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

import java.util.Scanner;

public class ColorConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter red color ");
        int red = scanner.nextInt();
        System.out.println("Enter green color ");
        int green = scanner.nextInt();
        System.out.println("Enter blue color ");
        int blue = scanner.nextInt();
        double w, c, m, y, k;
        if (red != 0 && green != 0 && blue != 0) {
            w = Math.max(red / 255.0, Math.max(green / 255.0, blue / 255.0));
            c = (w - (red / 255.0)) / w;
            m = (w - (green / 255.0)) / w;
            y = (w - (blue / 255.0)) / w;
            k = 1 - w;
        }
        else {
            c = 0;
            m = 0;
            y = 0;
            k = 1;
        }

        System.out.println("CMYK format is C = " + c + " M = " + m + " Y = " + y + " K = " + k);
        scanner.close();
    }
}
