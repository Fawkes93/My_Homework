package oddornot;

import java.util.Scanner;

public class OddOrNot {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("I beg you to please, kindly enter a number, please:");
        int input = in.nextInt();
        if (input % 2 > 0) {
            System.out.println("This is an odd number");
        }
        if (input % 2 == 0) {
            System.out.println("This is an even number");
        }
    }

}
