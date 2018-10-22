//Create a class named Billing that includes three overloaded computeBill() methods
//for a photo book store.
//* When computeBill() receives a single parameter, it represents the price of one
//photo book ordered. Add 8% tax, and return the total due.
//* When computeBill() receives two parameters, they represent the price of a
//photo book and the quantity ordered. Multiply the two values, add 8% tax, and
//return the total due.
//* When computeBill() receives three parameters, they represent the price of a
//photo book, the quantity ordered, and a coupon value. Multiply the quantity and
//price, reduce the result by the coupon value, and then add 8% tax and return the
//total due.
//Write a main() method that tests all three overloaded methods. Save the application
//as Billing.java.

public class Billing {

    private double photoBook;
    private double quantityOrdered;
    private int couponValue;

    public double computeBill(double photoBook) {
        double VAT = photoBook * 0.08;
        return this.photoBook = photoBook + VAT;
    }

    public double computeBill(double photoBook, double quantityOrdered) {
        double VAT = photoBook * 0.08;
        this.quantityOrdered = quantityOrdered;
        return this.photoBook = quantityOrdered * photoBook + VAT;
    }

    public double computeBill(double photoBook, double quantityOrdered, int couponValue) {
        double VAT = photoBook * 0.08;
        this.quantityOrdered = quantityOrdered;
        this.couponValue = couponValue;
        return this.photoBook = quantityOrdered * photoBook - couponValue + VAT;
    }

    public static void main(String[] args) {
        Billing test = new Billing();
        System.out.println(test.computeBill(50));
        System.out.println(test.computeBill(50, 2));
        System.out.println(test.computeBill(50, 2, 30));
    }
}
