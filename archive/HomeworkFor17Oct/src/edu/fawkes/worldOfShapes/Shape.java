/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.fawkes.worldOfShapes;

/**
 *
 * @author igor
 */
public class Shape {

    String shape;

    public Shape() {
        this.shape = "I am a shape of type ";
    }

    @Override
    public String toString() {
        return shape;
    }

    
}
