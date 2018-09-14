
package aliengame;

public class TwoCharacters {
    public static void main(String[] args) {
        Character brunoMars = new Character("Red", 5, 100);
        Character elonMusk = new Character("Black", 2, 1);
        displayCharacterProperties(elonMusk);
        displayCharacterProperties(brunoMars);
    }
    
    public static void displayCharacterProperties(Character character){
        System.out.println(" " +character.getBodyColor()+
                " body with "+character.getNumberOfEyes()+" and "+character.getNumberOfLives()+" spare lives");
    }
}
