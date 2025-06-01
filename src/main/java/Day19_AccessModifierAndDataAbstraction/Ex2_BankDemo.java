package Day19_AccessModifierAndDataAbstraction;
public class Ex2_BankDemo {
    public static void main(String[] args) {

        // Static method call
        Ex2_BankAccount.bankDetails();

        // Creating SavingsAccount object
        Ex2_BankAccount savingsAccount = new Ex2_SavingsAccount("SA12345", 1000.0, 5.0);
        savingsAccount.deposit(500);
        savingsAccount.calculateInterest(); // Here hiding the implementation through abstract method
        savingsAccount.withdraw(200);
        savingsAccount.displayBalance();

        System.out.println();

        // Creating CurrentAccount object
        Ex2_BankAccount currentAccount = new Ex2_CurrentAccount("CA54321", 2000.0);
        currentAccount.deposit(1000);
        currentAccount.calculateInterest(); // Here hiding the implementation through abstract method
        currentAccount.withdraw(500);
        currentAccount.displayBalance();
    }
}
