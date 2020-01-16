package factorialRecursion;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    double number=in.nextDouble();
    System.out.println(factoriall(number));

}

    public static double factoriall(double number){
        if(number==1){
            return number;
        }
        else{
            return number* factoriall(number-1);
        }
    }
}
