package Day14_Encapsulation;

public class Ex1_AccountMain {
    public static void main(String[] args) {
        Ex1_Account acc = new Ex1_Account();

        acc.setAccNo(101);
        acc.setName("John");
        acc.setAmount(56000);
        System.out.println(acc.getAccNo());
        System.out.println(acc.getName());
        System.out.println(acc.getAmount());
    }
}
