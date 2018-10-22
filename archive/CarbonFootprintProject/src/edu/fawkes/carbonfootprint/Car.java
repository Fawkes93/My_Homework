/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.fawkes.carbonfootprint;

/**
 *
 * @author igor
 */
public class Car implements CarbonFootprint {

    int litre;
    final int CO2 = 7;

    public Car(int litres) {
        this.litre = litres;
    }

    @Override
    public double getCarbonFootprint() {
        return litre * CO2;
    }

    @Override
    public String toString() {
        return "Your car generates " +getCarbonFootprint()+" of CO2 per year";
    }

}
