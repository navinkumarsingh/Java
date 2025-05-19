package ex18_AccessModifierAndDataAbstraction;
//Subclass: SavingsAccount
public class Ex2_SavingsAccount extends Ex2_BankAccount {

    private double interestRate;

    // Constructor
    public Ex2_SavingsAccount(String accno, double initialBalance, double interestRate) {
        super(accno, initialBalance);
        this.interestRate = interestRate;
    }

    // Implementation of the abstract method
    @Override
    public void calculateInterest() {
        double interest = balance * interestRate / 100;
        balance += interest;
        System.out.println("Interest Added: " + interest + ", New Balance: " + balance);
    }
}

