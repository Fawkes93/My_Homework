package piglatin;

import java.util.Scanner;

public class PigLatin {

    static Scanner in = new Scanner(System.in);
    static String word = in.nextLine();
    static int vowelStart = 0;
    static final String vowels = "aAeEuUiIoOyY";
    public static final char[] vowelsArray = vowels.toCharArray();

    public static void testWord() {
        for (int i = 0; i < vowelsArray.length; i++) {
            if (firstIsVowel(vowelsArray, i)) {
                applyVowelRule();
                break;
            } else {
                applyConsonantRule();
                break;
            }
        }
    }

    private static boolean firstIsVowel(char[] vowelsArray, int indexOfChar) {
        return vowelsArray[indexOfChar] == word.charAt(0);
    }

    public static void applyVowelRule() {
        word += "ay";
        System.out.println(word);
    }

    public static void applyConsonantRule() {
        char[] wordArray = word.toCharArray();
        if (wordArray[0] == 'y') {
            vowelStart = 1;

        } else {
            for (int i = 0; i < wordArray.length; i++) {
                for (int j = 0; j < vowelsArray.length; j++) {
                    if (wordArray[i] == vowelsArray[j]) {
                        vowelStart = i;
                        i = wordArray.length + 1;
                        j = vowelsArray.length + 1;
                    }
                }
            }
        }
        word = word.substring(vowelStart) + word.substring(0, vowelStart) + "ay";
        System.out.println(word);
    }

    public static void main(String[] args) {
    }
}
