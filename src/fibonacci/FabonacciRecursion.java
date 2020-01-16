package fibonacci;

import java.util.Scanner;

/**
 * @author YASH kUMAR SINGH
 */
public class FabonacciRecursion {
    /**
     * main method
     *
     * @param args to take command line arguments but not req as in here
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();//number of terms
        int a = 0;
        int b = 1;
        fabonacci(a, b, number);
    }

    /**
     * this function recursively calls itself  and prints fabonacci series
     *
     * @param a      first number is sequence
     * @param b      second number in the sequence
     * @param number no to times loops/recursion to be executed and no of terms printed
     */
    public static void fabonacci(int a, int b, int number) {
        System.out.print(a + " ");
        if (number == 1) {
            //do nothing and stop recursion fabonacci numbers generated
        } else {
            fabonacci(a + b, a, number - 1);
        }
    }
}
