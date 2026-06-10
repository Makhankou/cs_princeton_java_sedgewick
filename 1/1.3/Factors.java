/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

public class Factors {
    public static void main(String[] args) {
        long n = Long.parseLong(args[0]);
        for (long factor = 2; factor <= n / factor; factor++) {
            while (n % factor == 0) {
                n /= factor;
                System.out.println(factor + " ");
            }
        }
        if (n > 1) {
            System.out.print(n);
        }
        System.out.println();
    }
}
