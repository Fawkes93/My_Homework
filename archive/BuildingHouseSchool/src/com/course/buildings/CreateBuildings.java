/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.course.buildings;

/**
 *
 * @author igor
 */
public class CreateBuildings {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        School test = new School();
        House testHouse = new House();
        test.setClassrooms(10);test.setGradeLevel("elementary");
        test.setSquareFootage(1000);
        test.setStories(3);
        System.out.println(test);
        
        
        System.out.println(testHouse);
    }
    
}
