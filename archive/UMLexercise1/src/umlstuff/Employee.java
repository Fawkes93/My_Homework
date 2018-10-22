package umlstuff;

public class Employee {

    private int id, salary;
    private String firstName, lastName;

    public Employee(int id, String firstName, String lastName, int salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public int getSalary() {
        return salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    
    public void setAnnualSalary(int salary){
        this.salary = salary * 12;
    }
    
    public int raiseSalary (int percent){
        return salary * percent;
    }

    @Override
    public String toString() {
        return "Employee{" + "id= " + id + ", firstName= " + firstName + ", lastName= " + lastName + ", salary= " + salary + "}";
    }
        
}
