package mainpack;

public class TestSavingsAccount {

    public static void main(String[] args) {
        SavingsAccount saver1 = new SavingsAccount(2000.00);
        SavingsAccount saver2 = new SavingsAccount(5000.00);
        SavingsAccount.modifyInterestRate(0.04);

        for (SavingsAccount.Months month : SavingsAccount.Months.values()) {
            saver1.calculateMonthlyInterestRate();
            System.out.println("Saver1 result is " + saver1.calculateMonthlyInterestRate()
                    + " balance is now " + saver1.getnewSavingsBalance());
        }
        System.out.println("\n");
        for (SavingsAccount.Months month : SavingsAccount.Months.values()) {
            saver2.calculateMonthlyInterestRate();

            System.out.println("Saver2 result is " + saver2.calculateMonthlyInterestRate()
                    + " balance is now " + saver2.getnewSavingsBalance());
        }
        SavingsAccount.modifyInterestRate(0.05);
        saver1.calculateMonthlyInterestRate();

        System.out.println("next month's - " + saver1.calculateMonthlyInterestRate()
                + " balance is now " + saver1.getnewSavingsBalance());

        saver2.calculateMonthlyInterestRate();
        System.out.println("next month's - " + saver2.calculateMonthlyInterestRate()
                + " balance is now " + saver2.getnewSavingsBalance());
    }

}
