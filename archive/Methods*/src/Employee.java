/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author igor
 */
public class Employee {

    private String firstName;
    private String lastName;
    private double monthlySalary;

    public Employee(String firstName, String lastName, double monthlySalary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.monthlySalary = monthlySalary;

    }

    public String getFisrtName() {
        return this.firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName(){
        return this.lastName;
    }
    public void setLastName (String lastName){
        this.lastName = lastName;
    }
    public double getMonthlySalary (){
        return this.monthlySalary;
    }
    public void setMonthlySalary(double monthlySalary){
        if (monthlySalary > 0){
        this.monthlySalary = monthlySalary;
        }else {
            this.monthlySalary = 0;
        }
    }
    
    public double getAnnualSalary(){
        return this.monthlySalary * 12;
    }
}

