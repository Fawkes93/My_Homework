/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.fawkes.petstuff;

/**
 *
 * @author igor
 */
public class DemoItemsAndPets {
    public static void main(String[] args) {
        PetSold test1 = new PetSold();
        test1.setIsVaccined(true);
        ItemSold test2 = new ItemSold("fawkes21951");
        test2.setDescription("this is a nice description ");
        System.out.println(test1);
        System.out.println(test2);
        
        ItemSold test3 = new PetSold();
        
    }
}
