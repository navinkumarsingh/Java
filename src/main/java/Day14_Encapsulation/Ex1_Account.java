package Day14_Encapsulation;

public class Ex1_Account {
    private int accNo;
    private String name;
    private double amount;


    public void setAccNo(int accNo) {
         /*If class and local variable will be same, method will confuse, and it will assign default value(i.e. 0). Hence
        Zero/0 will be returned from acc.getAccNo in Ex1_AccountMain */
        //accNo=accNo;

        //So we use this keyword to differentiate class and local variable. The this keyword is used to refer to the
        // current object's instance variable
        this.accNo = accNo;
    }

    public int getAccNo() {
        return accNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
