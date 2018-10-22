/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patientpack;

import bloodtestpack.BloodData;

/**
 *
 * @author igor
 */
public class TestPatient {
    
    public static void main(String[] args) {
        BloodData bloodData = new BloodData("X", '-');
        Patient Vasili = new Patient();
        Patient Fedot = new Patient("Fedot ", 2003001002, 99, bloodData);
        System.out.println(Vasili);
        System.out.println(Fedot);
    }
}
