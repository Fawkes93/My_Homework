package passwordvalidator;

import java.util.Scanner;

public class PasswordValidator {

    static int upperCaseCount = 0;
    static int lowerCaseCount = 0;
    static int digitCount = 0;

    public static String validator() {
        Scanner input = new Scanner(System.in);
        String password = input.nextLine();
        char[] passBreaktoChar = password.toCharArray();

        for (int i = 0; i < passBreaktoChar.length; i++) {
            if (Character.isUpperCase(passBreaktoChar[i])) {
                if (upperCaseCount < 2) {
                    upperCaseCount++;
                }
            }
            if (Character.isLowerCase(passBreaktoChar[i])) {
                if (lowerCaseCount < 2) {
                    lowerCaseCount++;
                }
            }
            if (Character.isDigit(passBreaktoChar[i])) {
                if (digitCount < 2) {
                    digitCount++;
                }
            }
        }
        if (upperCaseCount < 2) {
            System.out.println("you need more uppercase");
            upperCaseCount = 0;
            lowerCaseCount = 0;
            digitCount = 0;
            validator();
            
        } else if (lowerCaseCount < 2) {
            System.out.println("you need more lowercase");
            upperCaseCount = 0;
            lowerCaseCount = 0;
            digitCount = 0;
            validator();
            
        } else if (digitCount < 2) {
            System.out.println("you need more digits");
            upperCaseCount = 0;
            lowerCaseCount = 0;
            digitCount = 0;
            validator();
        } else {
            System.out.println("LOGIN COMPLETE");
        }
        return "Welcome";
    }
//    private static final int ASCII_VALUE_OF_LOWERCASE_A = 95;
//    private static final int ASCII_VALUE_OF_LOWERCASE_Z = 122;
//    private static final int ASCII_VALUE_OF_UPPERCASE_A = 65;
//    private static final int ASCII_VALUE_OF_UPPERCASE_Z = 90;
    
    public static void main(String[] args) {

        System.out.println("Please enter your new password: ");
        System.out.println(validator());
    }

}
