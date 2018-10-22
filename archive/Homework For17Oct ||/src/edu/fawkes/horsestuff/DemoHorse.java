/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.fawkes.horsestuff;

/**
 *
 * @author igor
 */
public class DemoHorse {

    public static void main(String[] args) {
        Horse brego = new RaceHorse(2);
        brego.setColor("black");
        brego.setName("Brego");
        brego.setYearOfBirth(2005);
        System.out.println(brego);
        
    }

}
