/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author igor
 */
public class EmployeeTest {
    public static void main(String[] args) {
        Employee e1 = new Employee ("John", "Doe", 1500.0);
        Employee e2 = new Employee ("Vasea", "Pumpkin", -500.0);
        
        System.out.println("Annual salary 1 " + e1.getAnnualSalary());
        System.out.println("Annual salary 2 " + e2.getAnnualSalary());
        
        e2.setMonthlySalary(-500);
        
        System.out.println("Annual salary 1 " + e1.getAnnualSalary());
        System.out.println("Annual salary 2 " + e2.getAnnualSalary());
        
        e1.setMonthlySalary(e1.getMonthlySalary() + (e1.getMonthlySalary() * 0.10));
    }
    
}
