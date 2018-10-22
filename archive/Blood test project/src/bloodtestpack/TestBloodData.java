package bloodtestpack;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author igor
 */
public class TestBloodData {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        BloodData simple = new BloodData();
        BloodData withParameters = new BloodData("AB", '-');
        
        System.out.println(simple);
        System.out.println(withParameters);
        
    }
    
}
