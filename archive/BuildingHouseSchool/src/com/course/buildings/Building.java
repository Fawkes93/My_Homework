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
public class Building {
    double squareFootage;
    int stories;

    public Building() {
    }

    public Building(double squareFootage, int stories) {
        this.squareFootage = squareFootage;
        this.stories = stories;
    }

    public double getSquareFootage() {
        return squareFootage;
    }

    public void setSquareFootage(double squareFootage) {
        this.squareFootage = squareFootage;
    }

    public int getStories() {
        return stories;
    }

    public void setStories(int stories) {
        this.stories = stories;
    }

    @Override
    public String toString() {
        return "Building{" + "squareFootage=" + squareFootage + ", stories=" + stories + '}';
    }
    
}
