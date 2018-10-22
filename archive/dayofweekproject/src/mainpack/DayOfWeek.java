package mainpack;

import java.util.Scanner;

public class DayOfWeek {

    public enum Days {
        MONDAY("9 - 9"), 
        TUESDAY("9 - 9"), 
        WEDNESDAY("9 - 9"), 
        THURSDAY("9 - 9"), 
        FRIDAY("9 - 9"), 
        SATURDAY("9 - 6"),
        SUNDAY("11 - 5");

        private String hours;

        private Days(String h) {
            hours = h;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Days aDay;
        String input;

        for (Days day : Days.values()) {
            System.out.print(day + "--");
        }

        System.out.print("\nEnter day: ");
        input = in.nextLine().toUpperCase();

        try
        {
            aDay = Days.valueOf(input);

            System.out.println("The hours for " + aDay + " are " + aDay.hours);
        } catch (Exception e) {
            if (input.isEmpty()) {
                System.out.println("Nothing entered exiting.");
            } else {
                System.out.println("Error: Invalid entry");
            }
        }
    }
}
