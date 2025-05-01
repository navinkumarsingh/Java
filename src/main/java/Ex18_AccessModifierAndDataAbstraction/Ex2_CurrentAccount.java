package Ex18_AccessModifierAndDataAbstraction;
//Subclass: CurrentAccount
public class Ex2_CurrentAccount extends Ex2_BankAccount {

    // Constructor
    public Ex2_CurrentAccount(String accno, double initialBalance) {
        super(accno, initialBalance);
    }

    // Implementation of the abstract method
    @Override
    public void calculateInterest() {
        System.out.println("No interest is calculated for Current Account.");
    }
}
