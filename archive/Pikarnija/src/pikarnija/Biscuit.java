/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
*/
package pikarnija;

/**
 *
 * @author igor
 */
public class Biscuit {
    private int amountOfFlour;   //instance variable
    private int amountOfSugar; //
    private String shape;     //
    
    
    public static int howManyDegrees = 350; // class variable
    public static int howMuchTimeInMinutes = 30; //class variable
    
    public Biscuit (int amountOfFlour, int amountOfSugar, String shape){//this is the constructor
            
    this.amountOfFlour = amountOfFlour;
    this.amountOfSugar = amountOfFlour;
    this.shape = shape;
}
}
