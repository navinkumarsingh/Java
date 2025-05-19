package ex18_AccessModifierAndDataAbstraction;

//Abstract class: BankAccount
abstract class Ex2_BankAccount {
    String accno;
    double balance;

    // Constructor
    public Ex2_BankAccount(String accno, double initialBalance) {
        this.accno = accno;
        this.balance = initialBalance;
        System.out.println("Account Created: " + accno);
    }

    // Abstract method (must be implemented by subclasses)
    public abstract void calculateInterest();

    // Non-abstract method
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount + ", New Balance: " + balance);
    }

    // Non-abstract method
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount + ", Remaining Balance: " + balance);
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    // Final method (cannot be overridden)
    public final void displayBalance() {
        System.out.println("Account Balance: " + balance);
    }

    // Static method
    public static void bankDetails() {
        System.out.println("Welcome to ABC Bank");
    }
}
