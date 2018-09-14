
public class PaliOne {

    public static void main(String[] args) {

        int palindromeNumber = 12321;
        int palindromeNumberSec = palindromeNumber;
        int reverseNumber = 0;

        for (; palindromeNumber > 0; palindromeNumber /= 10) {
            System.out.println(palindromeNumber);
            int digit = palindromeNumber % 10;

            reverseNumber = reverseNumber * 10 + digit;
            System.out.println(reverseNumber);

        }
        if (reverseNumber == palindromeNumberSec) {
            System.out.println("TRUE");
        } else {
            System.out.println("FALSE");
        }

    }

}
