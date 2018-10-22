
package cardgame;

import java.util.Random;

public class Card {

    private final char[] suit = {'c', 'd', 'h', 's'};
    private final int[] value = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
    private final Random randomize = new Random();
    private String cardname, suitname;

    public char getSuit() {
        return suit[randomize.nextInt(suit.length)];
    }

    public int getValue() {
        return value[randomize.nextInt(value.length)];
    }

    public void setCardNameValue(String cardname) {
        this.cardname = cardname;
    }

    public String getCardName() {
        return cardname;
    }

    public String getCardSuit() {
        return suitname;
    }

    public void setCardSuitValue(String suitname) {
        this.suitname = suitname;
    }
}
