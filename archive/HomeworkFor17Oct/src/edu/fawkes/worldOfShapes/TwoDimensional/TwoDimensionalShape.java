/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.fawkes.worldOfShapes.TwoDimensional;

import edu.fawkes.worldOfShapes.Shape;

/**
 *
 * @author igor
 */
public class TwoDimensionalShape extends Shape{
    String tDShape = "two dimensional ";

    public TwoDimensionalShape() {
        tDShape = super.toString() + this.tDShape;
    }
    
    public static class Point{
        
        public double x, y;

        public Point(double x, double y) {
            this.x = x;
            this.y = y;
        }

        public double getX() {
            return x;
        }

        public double getY() {
            return y;
        }
        
        
    }
}
