/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

public class MathSinCosIsOne {
    public static void main(String[] args) {
        double theta = Double.parseDouble(args[0]);
        double sum = Math.sin(theta) * Math.sin(theta) + Math.cos(theta) * Math.cos(theta);
        System.out.println(sum);
    }
}
