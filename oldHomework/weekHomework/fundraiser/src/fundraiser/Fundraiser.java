package fundraiser;

import java.util.Scanner;

public class Fundraiser {

    public static void main(String[] args) {
        int adultMeal = 0;
        int childMeal = 0;
        int total;

        Scanner input = new Scanner(System.in);

        while (adultMeal >= 0 && childMeal >= 0) {
            System.out.println("How many adult meals would you like?");
            adultMeal = input.nextInt() * 7;
            System.out.println("and how many child's meals would you like?");
            childMeal = input.nextInt() * 4;
            System.out.println("Great, heres your cheque!");
            System.out.println("Adult meals .......... $ " + adultMeal);
            System.out.println("Child meals .......... $ " + childMeal);
            System.out.println("Grand total: $" + (total = childMeal + adultMeal));
            break;
        }
        //System.out.println("and how many child's meals would you like?");
        //childMeal = input.nextInt() * 4;

    }

}
