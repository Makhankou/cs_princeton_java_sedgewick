/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

public class TriangleSides {
    public static void main(String[] args) {
        boolean result = true;
        double side1 = Double.parseDouble(args[0]);
        double side2 = Double.parseDouble(args[1]);
        double side3 = Double.parseDouble(args[2]);
        
        if (side1 >= side2 + side3 || side2 >= side1 + side3 || side3 > side1 + side2) {
            result = false;
        }

        System.out.println(result);
    }
}
