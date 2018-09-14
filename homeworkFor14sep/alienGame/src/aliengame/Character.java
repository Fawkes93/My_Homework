package aliengame;

public class Character {

    private String bodyColor;
    private int numberOfEyes;
    private int numberOfLives;

    public Character(String bodyColor, int numberOfEyes, int numberOfLives) {
        this.bodyColor = bodyColor;
        this.numberOfEyes = numberOfEyes;
        this.numberOfLives = numberOfLives;
    }
    
        public String getBodyColor() {
        return bodyColor;
    }

    public int getNumberOfEyes() {
        return numberOfEyes;
    }

    public int getNumberOfLives() {
        return numberOfLives;
    }

    public void setBodyColor(String bodyColor) {
        this.bodyColor = bodyColor;
    }

    public void setNumberOfEyes(int numberOfEyes) {
        this.numberOfEyes = numberOfEyes;
    }

    public void setNumberOfLives(int numberOfLives) {
        this.numberOfLives = numberOfLives;
    }

}
/*Computer games often contain different characters or creatures. For example, you
might design a game in which alien beings possess specific characteristics such as
color, number of eyes, or number of lives. Design a character for a game, creating a
class to hold at least three attributes for the character. Include methods to get and
set each of the character’s attributes. Save the file as MyCharacter.java. Then write
an application in which you create at least two characters. In turn, pass each
character to a display method that displays the character’s attributes. Save the
application as TwoCharacters.java.*/
