
import java.util.Random;

public class TestCard {

    public static void main(String[] args) {
        Card card1 = new Card();
        Card card2 = new Card();
        Random rand = new Random();

        card1.setCardValue(rand.nextInt(13) + 1);
        setFinalValue(card1);
        card1.setCardSuite(rand.nextInt(4) + 1);
        setFinalSuite(card1);
        card2.setCardValue(rand.nextInt(13) + 1);
        setFinalValue(card2);
        card2.setCardSuite(rand.nextInt(4) + 1);
        setFinalSuite(card2);
        
        displayCard(card1);
        displayCard(card2);
           
    }
    public static void setFinalSuite(Card card) {
        switch (card.getCardSuite()) {
            case 1:
                card.setExplicitCardSuite("Spades");
                break;
            case 2:
                card.setExplicitCardSuite("Clubs");
                break;
            case 3:
                card.setExplicitCardSuite("Hearts");
                break;
            case 4:
                card.setExplicitCardSuite("Diamonds");
                break;
        }
    }

    public static void setFinalValue(Card card) {
        switch (card.getCardValue()) {
            case 1:
                card.setExplicitCardValue("Ace");
                break;
            case 2:
                card.setExplicitCardValue("Two");
                break;
            case 3:
                card.setExplicitCardValue("Three");
                break;
            case 4:
                card.setExplicitCardValue("Four");
                break;
            case 5:
                card.setExplicitCardValue("Five");
                break;
            case 6:
                card.setExplicitCardValue("Six");
                break;
            case 7:
                card.setExplicitCardValue("Seven");
                break;
            case 8:
                card.setExplicitCardValue("Eight");
                break;
            case 9:
                card.setExplicitCardValue("Nine");
                break;
            case 10:
                card.setExplicitCardValue("Ten");
                break;
            case 11:
                card.setExplicitCardValue("Jack");
                break;
            case 12:
                card.setExplicitCardValue("Queen");
                break;
            case 13:
                card.setExplicitCardValue("King");
                break;
        }
    }

    public static void displayCard(Card card) {
        System.out.println("Your card: " + card.getExplicitCardValue() + " of " + card.getExplicitCardSuite());
    }
}