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
public class Building implements CarbonFootprint {

    double CO2fromTherm;

    public Building(double therms) {  //1 therm = 2.83 cubic metres
        this.CO2fromTherm = therms * 11.7;
    }

    @Override
    public double getCarbonFootprint() {

        return CO2fromTherm;
    }

    @Override
    public String toString() {
        return "The building produces " + getCarbonFootprint() + " of CO2 from burned natural gas"
                + " per month";
    }
}
