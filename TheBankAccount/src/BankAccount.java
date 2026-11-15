public class BankAccount {

    private  String accountName;
    private String accountNumber;
    private int accountBalance;

    public BankAccount(String name, String number, int balance) {

        accountName = name;
        accountNumber = number;
        accountBalance = balance;
    }

    void displayDetails() {

        System.out.println("Name: " + accountName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Balance " + accountBalance);
    }
}
