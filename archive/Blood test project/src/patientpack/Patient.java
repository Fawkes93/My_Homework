package patientpack;

import bloodtestpack.BloodData;

/**
 *
 * @author igor
 */
public class Patient {

    int idNumber, age;
    BloodData bloodData;
    String name;

    Patient() {
        idNumber = 0;
        age = 0;
        this.bloodData = new BloodData();
        name = "unknown";
        
    }
    Patient(String name, int idNumber, int age, BloodData bloodData){
         this.idNumber = idNumber;
        this.age = age;
        this.bloodData = bloodData;
        this.name = name;
    }

    @Override
    public String toString(){
        return "Patient Name " + name +" ID " + idNumber + " Age " + age + " Blood " +bloodData;
    }
}
