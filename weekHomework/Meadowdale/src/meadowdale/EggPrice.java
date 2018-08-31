package meadowdale;

import java.util.Scanner;

public class EggPrice {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int eggs, looseEggs, dozen;
        System.out.printf("How many eggs would you like to purchase? \n");
        eggs = input.nextInt();
        if (eggs > 11) {
            looseEggs = eggs % 12;
            dozen = eggs / 12;
            double total = dozen * 3.45 + looseEggs * 0.45;
            System.out.println("\nThat's " + dozen + " dozen at $3.25 per dozen and " + looseEggs
                    + " loose eggs at 45 cents each" + "for a total of" + total);
            System.out.printf(" for a total of $%.2f", total, "\n");
        } else if (eggs > 0) {
            double total2 = eggs * 0.45;
            System.out.println("That's " + eggs + " eggs at 45 cents each for a total of $" + total2);
        } else {
            System.out.println("Maybe you want my balls instead?");
        }
    }
}
//That’s 2 dozen at $3.25 per dozen and 3 loose eggs at 45 cents each for a total of $7.85.”
//System.out.printf( "Product 2: $%.2f\n", prod2 * prod2price);
// if I input a charater the code breaks
// cannot use printf to write all the text
