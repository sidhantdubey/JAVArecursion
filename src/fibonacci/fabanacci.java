package fibonacci;

import java.util.Scanner;

public class fabanacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int range = in.nextInt();
        int a = 0, b = 1;

        for (int i = 0; i < range; i++) {
            System.out.print(a + " ");
            int temp = a;
            a = a + b;
            b = temp;
        }
    }
}
