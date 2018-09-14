package cardgame;

public class TestCard {

    public static void main(String[] args) {
        Card cardPair1 = new Card();
        Card cardPair2 = new Card();
        setValueName(cardPair1);
        setValueName(cardPair2);
        setValueSuite(cardPair1);
        setValueSuite(cardPair2);
        showHand(cardPair1);
        showHand(cardPair2);

    }

    public static void setValueName(Card card) {
        switch (card.getValue()) {
            case 1:
                card.setCardNameValue("Ace");
                break;
            case 2:
                card.setCardNameValue("2");
                break;
            case 3:
                card.setCardNameValue("3");
                break;
            case 4:
                card.setCardNameValue("4");
                break;
            case 5:
                card.setCardNameValue("5");
                break;
            case 6:
                card.setCardNameValue("6");
                break;
            case 7:
                card.setCardNameValue("7");
                break;
            case 8:
                card.setCardNameValue("8");
                break;
            case 9:
                card.setCardNameValue("9");
                break;
            case 10:
                card.setCardNameValue("10");
                break;
            case 11:
                card.setCardNameValue("Jack");
                break;
            case 12:
                card.setCardNameValue("Queen");
                break;
            case 13:
                card.setCardNameValue("King");
                break;
        }
    }

    public static void setValueSuite(Card card) {
        switch (card.getSuit()) {
            case 'c':
                card.setCardSuitValue("Clubs");
                break;
            case 'd':
                card.setCardSuitValue("Diamonds");
                break;
            case 'h':
                card.setCardSuitValue("Hearts");
                break;
            case 's':
                card.setCardSuitValue("Spades");
                break;
        }
    }
            
    public static void showHand(Card card) {
        System.out.println(card.getCardName()+ " of " + card.getCardSuit());
    }
}