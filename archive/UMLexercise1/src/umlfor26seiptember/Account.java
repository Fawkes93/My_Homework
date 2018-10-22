package umlfor26seiptember;

public class Account {

    int id;
    double balance = 0.0f;
    Customer customer;

    public Account(int id, Customer customer) {
        this.id = id;
        this.customer = customer;
    }

    public Account(int id, Customer customer, double balance) {
        this.id = id;
        this.customer = customer;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Customer getCustomer() {
        return customer;
    }

    @Override
    public String toString() {
        return customer.toString() + " balance = " + System.out.printf("%.2f", getBalance());
    }

    public void deposit(double amount) {
        this.balance = getBalance() + amount;
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            this.balance = getBalance() - amount;
        } else {
            System.out.println("amount withdrawn exceeds the current balance!");
        }
    }

}
