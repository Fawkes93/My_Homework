
public class Replace {

    public static String replaceChar(String str, char oldChr, char newChr, int index, int replaces) {

        char[] toCharArray = str.toCharArray();
        System.out.println(toCharArray);
        int counter = 0;

        for (int i = index; i < toCharArray.length; i++) {
            
            //daca bag counter aici, mi-l reseteaza
            //why no constructor here...
            if (toCharArray[i] == oldChr) {

                toCharArray[i] = newChr;

                counter++;
                if (counter == replaces) {
                    break;
                }
            }

        }

        return new String(toCharArray);
    }

    public static void main(String[] args) {

        String fawkes = replaceChar("DADEDIDODUDOMDAREDUST", 'D', '*', 3, 2);
        System.out.println(fawkes + " ");
    }
}

//public static void main(String[] args) {  
//    String myString = replaceCharTimes("OCA Java course for ultimate beginners", 'e', 'E', 2);
//    System.out.println(myString);
//    //should display OCA Java coursE for ultimatE beginners
//  }
//
//  public static String replaceCharTimes(String stringToBeModified, char toBeReplaced, char replace, int counter) {
//    // your code goes here
//  }

