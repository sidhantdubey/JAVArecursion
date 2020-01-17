package factorialRecursion;

import java.util.Scanner;

/**
 * program to calculate factorial using recursive call
 */
public class FactorialRecursion {
    /**
     * main method
     *
     * @param args to take commandline arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double number = in.nextDouble();
        System.out.println(factoriall(number));

    }

    /**
     * methos to calculate factorial using recursive calling
     * @param number the nuber whose factorial is to be calculated
     * @return number * number-1*...*1 using recursive call
     */
    public static double factoriall(double number){
        if(number==1){
            return number;
        } else{
            return number* factoriall(number-1);
        }
    }
}
