/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.fawkes.worldOfShapes;

import edu.fawkes.worldOfShapes.TwoDimensional.Parallelogram;
import edu.fawkes.worldOfShapes.TwoDimensional.Polygon;
import edu.fawkes.worldOfShapes.TwoDimensional.Quadrilateral;
import edu.fawkes.worldOfShapes.TwoDimensional.Square;

/**
 *
 * @author igor
 */
public class TestShape {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Quadrilateral test1 = new Parallelogram(10, 10, 10, 10);
        test1.toString();
        
        System.out.println("and a square \n");
        Quadrilateral test2  = new Square(10, 15, 15);
        test2.toString();

    }

}
