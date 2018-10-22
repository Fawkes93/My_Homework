package bloodtestpack;

//Create a class named BloodData that includes fields that hold a blood type (the
//four blood types are O, A, B, and AB) and an Rh factor (the factors are + and –).
//Create a default constructor that sets the fields to “O” and “+”, and an overloaded
//constructor that requires values for both fields. Include get and set methods for
//each field. Save this file as BloodData.java. Create an application named
//TestBloodData that demonstrates each method works correctly. Save the
//application as TestBloodData.java.
//b. Create a class named Patient that includes an ID number, age, and BloodData.
//Provide a default constructor that sets the ID number to “0”, the age to 0, and the
//BloodData to “O” and “+”. Create an overloaded constructor that provides values
//for each field. Also provide get methods for each field. Save the file as Patient.java.
//Create an application that demonstrates that each method works correctly, and
//save it as TestPatient.java.

public class BloodData {

    private String bloodType;
    private char rhFactor;

    public BloodData() {
        bloodType = "0";
        rhFactor = '+';

    }

    public BloodData(String bloodType, char rhFactor) {

        this.bloodType = bloodType;
        this.rhFactor = rhFactor;
    }

    public String getBloodType() {

        return bloodType;

    }

    public void setBloodType(String bloodType) {

        this.bloodType = bloodType;
    }

    public char getRHFactor() {
        return rhFactor;
    }

    public void setRHFactor(char rhFactor) {
        this.rhFactor = rhFactor;
    }

    @Override
    public String toString() {
        return "Blood information -" + " bloodType is " + bloodType + ", rhFactor is " + rhFactor;
    }
}
