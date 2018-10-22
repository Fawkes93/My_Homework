/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.fawkes.carbonfootprint;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author igor
 */
public class TestCFP {

    /**
     * @param args the command line arguments
     */
    public static void main(String... args) {
        List<CarbonFootprint> listy = new ArrayList();//seems to work also without <> diamond
        listy.add(new Car(200));
        listy.add(new Building(2000));
        listy.add(new Bicycle());
        listy.forEach((element) -> {
            System.out.println(element);
        });
    }

}
