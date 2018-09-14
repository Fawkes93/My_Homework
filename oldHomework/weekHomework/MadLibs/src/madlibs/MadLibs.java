package madlibs;

import java.util.Scanner;

public class MadLibs {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a noun:");
        String noun = input.next();
        System.out.println("Enter another one:");
        String noun2 = input.next();
        System.out.println("Enter a past-tense verb:");
        String pastTenseVerb = input.next();
        System.out.println("Enter an adjective:");
        String adjective = input.next();

        while (true) {
            System.out.println("\nMary had a little " + noun);
            System.out.println("Its " + noun2 + " was silly as snow");
            System.out.println("And everywhere that Mary " + pastTenseVerb);
            System.out.println("The " + adjective + " was sure to go");

            System.out.println("\nEnter a noun:");
            noun = input.next();
            System.out.println("Enter another one:");
            noun2 = input.next();
            System.out.println("Enter a past-tense verb:");
            pastTenseVerb = input.next();
            System.out.println("Enter an adjective:");
            adjective = input.next();

            if ("exit".equals(noun)) {
                System.out.println("Good bye!");
                break;
            }
        }
    }

}
//Mary had a little table
//Its book was silly as snow
//And everywhere that Mary studied
//The table was sure to go.
