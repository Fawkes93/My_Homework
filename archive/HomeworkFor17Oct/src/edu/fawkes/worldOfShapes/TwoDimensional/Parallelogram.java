/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.fawkes.worldOfShapes.TwoDimensional;

import java.awt.geom.Point2D;

/**
 *
 * @author igor
 */
public class Parallelogram extends Quadrilateral {

    private double base, height, area;

    public Parallelogram() {
        super();
    }//end of constructor

    public Parallelogram(double x, double y, double base, double height) {
        super();
        this.base = base;
        this.height = height;
        
        double baseDistance = 0.0;

        super.upperLeft = new Point(x, y);
        super.upperRight = new Point(x + base, y);
        super.lowerLeft = new Point(x - baseDistance, y + height);
        super.lowerRight = new Point((x - baseDistance) + base, y + height);
    }

    @Override
    public String toString()
{
System.out.println("Name of class : " + getClass());
System.out.println("Left: (" +  upperLeft.getX() + ", " + upperLeft.getY() + ")");
System.out.println("Right: (" +  upperRight.getX() + ", " + upperRight.getY() + ")");
System.out.println("Bottom-Left: (" +  lowerRight.getX() + ", " + lowerRight.getY() + ")");
System.out.println("Bottom-Right: (" +  lowerRight.getX() + ", " + lowerRight.getY() + ")");
System.out.println("Base: " + base);
System.out.println("Height: " + height);
System.out.println("Area: " + calculateArea());
return "";
}

    @Override
    public double calculateArea() {
        this.area = base * height;
        return area;
    }
}
