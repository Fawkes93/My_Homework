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
public class School extends Building {

    int classrooms;
    String gradeLevel;

    public School() {
        super();
    }
    
    public int getClassrooms() {
        return classrooms;
    }

    public void setClassrooms(int classrooms) {
        this.classrooms = classrooms;
    }

    public String getGradeLevel() {
        return gradeLevel;
    }

    public void setGradeLevel(String gradeLevel) {
        this.gradeLevel = gradeLevel;
    }

    @Override
    public double getSquareFootage() {
        return squareFootage;
    }

    @Override
    public void setSquareFootage(double squareFootage) {
        this.squareFootage = squareFootage;
    }

    @Override
    public int getStories() {
        return stories;
    }

    @Override
    public void setStories(int stories) {
        this.stories = stories;
        
    }

    @Override
    public String toString() {
        return super.toString()+"School{" + "classrooms=" + classrooms + ", gradeLevel=" + gradeLevel + '}';
    }

    


    
}
