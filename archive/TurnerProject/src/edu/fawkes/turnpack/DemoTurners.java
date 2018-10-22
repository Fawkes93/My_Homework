/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.fawkes.turnpack;

/**
 *
 * @author igor
 */
public class DemoTurners {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Turner leaf = new Leaf();
        Turner page = new Page();
        Turner pancacke = new Pancake();
        leaf.turn();
        page.turn();
        pancacke.turn();
    }
    
}
