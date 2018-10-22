
package moviespaces;

public class MovieSpaces {

    public static String countSpaces(String quote) {
        char[] convertToChar = quote.toCharArray();
        int counter = 0;
        
        for (int i = 0; i < convertToChar.length; i++) {
            if (convertToChar[i] == ' ') {
                counter++;
            }
        }
        return " " + counter;
    }
    public static String countSpaces() {
        String quote = "You know how to whistle, don't you, Steve?";
        char[] convertToChar = quote.toCharArray();
        int counter = 0;
        for (int i = 0; i < convertToChar.length; i++) {
            if (convertToChar[i] == ' ') {
                counter++;
            }
        }
        return " " + counter;

    }
    public static void main(String[] args) {
        String fawkes = countSpaces("You know how to whistle, don't you, Steve? You just put your lips together and blow.");
        System.out.println(fawkes);
        System.out.println(" ");
        System.out.println(countSpaces());
    }

}
