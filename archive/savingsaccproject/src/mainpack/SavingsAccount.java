package mainpack;

public class SavingsAccount {

    public enum Months {
        JAN,
        FEB,
        MAR,
        APR,
        MAY,
        JUN,
        JUL,
        AUG,
        SEP,
        OCT,
        NOV,
        DEC;
    }

    private static double annualInterestRate;
    private Double savingsBalance;

    public SavingsAccount(double savingsBalance) {
        this.savingsBalance = savingsBalance;
    }

    public double calculateMonthlyInterestRate() {

        double monthlyInterest = savingsBalance * (annualInterestRate / 12);

        savingsBalance += monthlyInterest;

        return monthlyInterest;
        
    }
    public Double getnewSavingsBalance(){
    
        return savingsBalance;
    }
    

    public static void modifyInterestRate(double newRate) {
        annualInterestRate = newRate;
    }
}
