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
public class RaceHorse extends Horse {

    int racesCompeted;

    public RaceHorse() {
    }

    public RaceHorse(int racesCompeted) {
        this.racesCompeted = racesCompeted;
    }

    public RaceHorse(int racesCompeted, String name, String color, Integer yearOfBirth) {
        super();
        this.racesCompeted = racesCompeted;
    }

    public void setRacesCompeted(int racesCompeted) {
        this.racesCompeted = racesCompeted;
    }

    public int getRacesCompeted() {
        return racesCompeted;
    }

    @Override
    public String toString() {
        System.out.print("Horse called " + name);
        System.out.print(" of " + color + " color");
        System.out.print(" born in " + yearOfBirth +".");
        System.out.print(" " + racesCompeted + " races competed");
        return "";
    }

}
