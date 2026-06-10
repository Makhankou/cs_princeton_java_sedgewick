/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

public class Swap {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        System.out.println("a = " + a + ", b = " + b);
        int t = a;
        System.out.println("a = " + a + ", b = " + b + ", t = " + t);
        a = b;
        System.out.println("a = " + a + ", b = " + b + ", t = " + t);
        b = t;
        System.out.println("a = " + a + ", b = " + b + ", t = " + t);
    }
}
