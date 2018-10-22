/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package umlstuff;

/**
 *
 * @author igor
 */
public class TestTime {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Time clock = new Time();
        clock.setTime(13, 45, 23);
        System.out.println(clock.toString());
        clock.previousSecond();
        System.out.println(clock.toString());
        clock.nextSecond();
        System.out.println(clock.toString());

    }

}
