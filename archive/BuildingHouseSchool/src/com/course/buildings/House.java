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
public class House extends Building {

    int bedrooms, baths;

    public int getBedrooms() {
        return bedrooms;
    }

    public void setBedrooms(int bedrooms) {
        this.bedrooms = bedrooms;
    }

    public int getBaths() {
        return baths;
    }

    public void setBaths(int baths) {
        this.baths = baths;
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
        return super.toString() + "House{" + "bedrooms=" + bedrooms + ", baths=" + baths + '}';
    }

}
