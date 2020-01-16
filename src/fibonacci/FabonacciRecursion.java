package fibonacci;

import java.util.Scanner;

/**
 * @author YASH kUMAR SINGH
 */
public class FabonacciRecursion {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();//number of terms
        int a = 0;
        int b = 1;
        fabonacci(a, b, number);
    }

    public static void fabonacci(int a, int b, int number) {
        System.out.print(a + " ");
        if (number == 1) {
            //do nothing and stop recursion fabonacci numbers generated
        } else {
            fabonacci(a + b, a, number - 1);
        }
    }
}
