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
public class Leaf implements Turner {
    @Override
    public void turn(){
        System.out.println("Changing colors");
    }
}
