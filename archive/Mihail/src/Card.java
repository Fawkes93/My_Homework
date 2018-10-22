public class Card {
    private int cardValue; // random number between 1 and 13
    private String explicitCardValue; // Name of the card, ex: Ace
    private int cardSuite; // random number between 1 and 4
    private String explicitCardSuite; // Suite of the card, ex: Hearts

    public int getCardValue(){
        return cardValue;
    }
    
    public String getExplicitCardValue(){
        return explicitCardValue;
    }
    
    public int getCardSuite(){
        return cardSuite;
    }
    
    public String getExplicitCardSuite(){
        return explicitCardSuite;
    }
    
    public void setCardValue(int value){
        this.cardValue = value;
    }
    
    public void setCardSuite(int value){
        this.cardSuite = value;
    }
    
    public void setExplicitCardValue(String value){
        this.explicitCardValue = value;
    }
    
    public void setExplicitCardSuite(String suite){
        this.explicitCardSuite = suite;
    }  
}
