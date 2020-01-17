package factorialRecursion;

import java.util.Scanner;

public class FactorialWithoutRecursion {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int fact = 1;
        for (int i = 1; i <= number; i++) {
            fact = fact * i;
        }
        System.out.println("the factorial of given number is " + fact);
    }
}
