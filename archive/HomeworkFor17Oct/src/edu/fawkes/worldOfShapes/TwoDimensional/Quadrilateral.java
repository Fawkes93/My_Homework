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
public abstract class Quadrilateral extends TwoDimensionalShape {

    public Point upperRight = new Point(0, 0);
    public Point upperLeft = new Point(0, 0);
    public Point lowerRight = new Point(0, 0);
    public Point lowerLeft = new Point(0, 0);

    public abstract double calculateArea();

    

}
