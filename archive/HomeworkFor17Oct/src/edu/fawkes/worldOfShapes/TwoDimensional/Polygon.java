/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.fawkes.worldOfShapes.TwoDimensional;

/**
 *
 * @author igor
 */
public class Polygon extends TwoDimensionalShape {
    String polygon;

    public Polygon() {
        this.polygon = "polygon";
    }
    
     
    
    public void shout(){
        polygon = super.tDShape += this.polygon;
        System.out.println(polygon);
    }

    @Override
    public String toString() {
        return polygon;
    }
    
    
    
}
